package com.travel.pre.spider.pipeline;

import java.util.Date;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import com.travel.domain.Article;
import com.travel.service.interfaces.IArticleSV;
import com.travel.util.DateUtil;
import com.travel.util.TravelStaticValue;

public class ArticlePipeline implements Pipeline {

	private IArticleSV articleSV;
	
	public ArticlePipeline(IArticleSV articleSV){
		this.articleSV = articleSV;
	}
	
	public void process(ResultItems resultItems, Task task) {
		String url = resultItems.get("url");
		if(url!=null && url.startsWith("http://www.biketo.com/tour/notes/")){
			data2DB(resultItems);
		}
	}
	
	private void data2DB(ResultItems resultItems){
		String url = resultItems.get("url");
		String title = resultItems.get("title");
		String author = resultItems.get("author");
		String content = resultItems.get("content");
		String introduction = resultItems.get("introduction");
		String articleTime = resultItems.get("articleTime");
		
		Article article = new Article();
		
		article.setUrl(url);
		article.setTitle(title);
		article.setAuthor(author);
		article.setContent(content);
		article.setIntroduction(introduction);
		article.setArticleTime(DateUtil.str2date("yyyy-MM-dd HH:mm:ss", articleTime));
		article.setCreateTime(new Date());
		article.setState(TravelStaticValue.DATA_STATE_U);
		
		articleSV.saveArticle(article);
	}

}
