package com.travel.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import com.danga.MemCached.MemCachedClient;
import com.travel.pre.spider.pipeline.ArticlePipeline;
import com.travel.pre.spider.processor.BikeToPageProcessor;
import com.travel.service.interfaces.IArticleSV;

public class ArticleJob extends QuartzJobBean {
	private static Log log = LogFactory.getLog(ArticleJob.class);
	
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		try {
			SchedulerContext schedulerContext = context.getScheduler().getContext();
			IArticleSV articleSV = (IArticleSV) schedulerContext.get("articleSV");
			MemCachedClient memClient = (MemCachedClient) schedulerContext.get("memClient");
			
			Pipeline articlePipeline = new ArticlePipeline(articleSV);
			PageProcessor biketoPageProcessor = new BikeToPageProcessor(memClient);
			
			Spider.create(biketoPageProcessor)
					.addUrl("http://www.biketo.com")
					.addPipeline(articlePipeline)
					.run();
			
		} catch (SchedulerException e) {
			log.info(e);
		}
	}
	
}
