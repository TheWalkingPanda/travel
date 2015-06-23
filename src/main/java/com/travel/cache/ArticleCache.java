package com.travel.cache;

import java.util.List;

import com.danga.MemCached.MemCachedClient;
import com.travel.service.interfaces.IArticleSV;

public class ArticleCache {
	
	private IArticleSV articleSV;
	
	private MemCachedClient memClient;
	
	public void cacheArticleURL(){
		List<String> allArticleURL = articleSV.getAllArticleURL();
		memClient.set("allArticleURL", allArticleURL);
	}

	
	
	
	
	
	public IArticleSV getArticleSV() {
		return articleSV;
	}

	public void setArticleSV(IArticleSV articleSV) {
		this.articleSV = articleSV;
	}

	public MemCachedClient getMemClient() {
		return memClient;
	}

	public void setMemClient(MemCachedClient memClient) {
		this.memClient = memClient;
	}
}
