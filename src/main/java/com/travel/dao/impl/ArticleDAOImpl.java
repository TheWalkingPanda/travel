package com.travel.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.travel.dao.interfaces.IArticleDAO;
import com.travel.domain.Article;

@Repository
@SuppressWarnings("unchecked")
public class ArticleDAOImpl implements IArticleDAO {

	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public long saveArticle(Article article) {
		Object result = sqlMapClientTemplate.insert("saveArticle", article);
		return Long.parseLong(result.toString());
	}

	public List<String> getAllArticleURL() {
		return sqlMapClientTemplate.queryForList("getAllArticleURL");
	}

}
