package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.interfaces.IArticleDAO;
import com.travel.domain.Article;
import com.travel.service.interfaces.IArticleSV;

@Service("articleSV")
public class ArticleSVImpl implements IArticleSV {

	@Autowired
	private IArticleDAO articleDao;
	
	public long saveArticle(Article article) {
		return articleDao.saveArticle(article);
	}

	public List<String> getAllArticleURL() {
		return articleDao.getAllArticleURL();
	}

}
