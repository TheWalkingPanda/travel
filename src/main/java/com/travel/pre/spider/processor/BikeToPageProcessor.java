package com.travel.pre.spider.processor;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import com.travel.util.HtmlUtil;

public class BikeToPageProcessor implements PageProcessor {
	private static Log log = LogFactory.getLog(BikeToPageProcessor.class);
	
	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);
	
	private boolean tag = true;
	
	/**
	 * 获取所有文章列表页面的URL，并加入爬虫列表
	 */
	public void getArticleListLinks(Page page){
		String rootLinks = "http://www.biketo.com/tour/index_";
		for(int i=1; i<=95; i++){
			page.addTargetRequest(rootLinks+i+".html");
		}
	}
	
	/**
	 * 获取当前页中所有的链接，并过滤得到所有文章链接，加入爬虫列表
	 */
	public void getArticleLinks(Page page){
		List<String> articleLinks = page.getHtml().links().regex("(http://www.biketo.com/tour/notes/[0-9]*.html)").all();
		for(int i=0; i<articleLinks.size(); i++){//将所有链接加上“显示全部”参数
			articleLinks.set(i, articleLinks.get(i)+"?all=1#page_0");
		}
		page.addTargetRequests(articleLinks);
	}
	
	/**
	 * 获取当前文章页面中的文章有效内容
	 */
	public void getArticle(Page page){
		Html html = page.getHtml();
		
		page.putField("url", getCurrentURL(page));
		page.putField("title", HtmlUtil.getText(html.$("h1")));
		page.putField("author", HtmlUtil.getText(html.$("div.article-author")).substring(3));
		page.putField("content", HtmlUtil.completeImgSrc(html.$("div.article-content"), "http://www.biketo.com", "/d/file/tour/notes/"));
		page.putField("introduction", "test introduction");
		page.putField("articleTime", HtmlUtil.getText(html.$("div.article-time")));
	}
	
	public void process(Page page) {
		if(tag){
			getArticleListLinks(page);
			tag = false;
		}
		
		String requestURL = getCurrentURL(page);
		if(requestURL.startsWith("http://www.biketo.com/tour/index_")){
			getArticleLinks(page);
		}else if(requestURL.startsWith("http://www.biketo.com/tour/notes/")){
			getArticle(page);
		}
	}

	
	/**
	 * 获取当前页面url
	 */
	public String getCurrentURL(Page page){
		return page.getRequest().getUrl();
	}
	
	public Site getSite() {
		return site;
	}

}
