package com.travel.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.io.IoApi;
import com.qiniu.api.io.PutExtra;
import com.qiniu.api.rs.EntryPath;
import com.qiniu.api.rs.PutPolicy;
import com.qiniu.api.rs.RSClient;
import com.qiniu.api.rsf.ListItem;
import com.qiniu.api.rsf.ListPrefixRet;
import com.qiniu.api.rsf.RSFClient;

public class QiniuClient {
	private Mac mac;
	private String token;
	private String bucket;
	
	private QiniuClient(){
		try {
			mac = new Mac(PropertiesUtil.getProperty("accessKey"), PropertiesUtil.getProperty("secretKey"));
			bucket = PropertiesUtil.getProperty("bucket");
			PutPolicy putPolicy = new PutPolicy(bucket);
			token = putPolicy.token(mac);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 本地文件上传至七牛存储
	 * @param key 		云存储的文件名（用原图片url作为key）
	 */
	public boolean upload(InputStream data, String key){
		try {
			PutExtra extra = new PutExtra();
			IoApi.Put(token, DateUtil.getFormatDate("yyyyMMdd", new Date())+key, data, extra);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 批量获取指定前缀的文件
	 */
	public List<ListItem> getFilesByPrefix(String prefix){
		RSFClient client = new RSFClient(mac);
		String marker = "";
		
		List<ListItem> files = new ArrayList<ListItem>();
		ListPrefixRet ret = null;
		
		while(true){
			ret = client.listPrifix(bucket, prefix, marker, Integer.parseInt(PropertiesUtil.getProperty("batchCount")));
			marker = ret.marker;
			files.addAll(ret.results);
            if (!ret.ok()) {
            	break;
            }
		}
		return files;
	}
	
	/**
	 * 批量删除文件
	 */
	public boolean batchDel(List<ListItem> files){
		if(files==null || files.size()==0){
			System.out.println("没有要删除的文件！");
			return false;
		}
		try {
			RSClient rs = new RSClient(mac);
			List<EntryPath> entries = new ArrayList<EntryPath>();
			
			for(ListItem item : files){
				EntryPath ep = new EntryPath();
				ep.bucket = bucket;
				ep.key = item.key;
				entries.add(ep);
			}
			rs.batchDelete(entries);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private static class QiniuHolder{
		private static QiniuClient instance = new QiniuClient();
	}
	
	public static QiniuClient getInstance(){
		return QiniuHolder.instance;
	}
	
	public static void main(String[] args) {
		//删除180天前，当天所有的图片
		int historyDay = Integer.parseInt(PropertiesUtil.getProperty("historyDay"));
		List<ListItem> files = QiniuClient.getInstance().getFilesByPrefix(DateUtil.getTheDate(historyDay, "yyyyMMdd"));
//		List<ListItem> files = QiniuClient.getInstance().getFilesByPrefix("20150526");
		QiniuClient.getInstance().batchDel(files);
	}
}
