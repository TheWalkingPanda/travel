package com.travel.cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.danga.MemCached.MemCachedClient;

public class ArticleCache {
	public static void test(){
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/spring/applicationContext.xml");
		MemCachedClient memClient = ac.getBean(MemCachedClient.class);
		memClient.set("test", "forTest");
		System.out.println(111);
	}
	
	public static void main(String[] args) {
		test();
	}
}
