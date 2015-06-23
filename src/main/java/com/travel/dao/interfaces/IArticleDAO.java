package com.travel.dao.interfaces;

import java.util.List;

import com.travel.domain.Article;

public interface IArticleDAO {
	public long saveArticle(Article article);
	public List<String> getAllArticleURL();
}
