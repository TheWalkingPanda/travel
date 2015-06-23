package com.travel.service.interfaces;

import java.util.List;

import com.travel.domain.Article;

public interface IArticleSV {
	public long saveArticle(Article article);
	public List<String> getAllArticleURL();
}
