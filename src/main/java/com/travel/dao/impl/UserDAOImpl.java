package com.travel.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.travel.dao.interfaces.IUserDAO;
import com.travel.domain.User;

@Repository
@SuppressWarnings("unchecked")
public class UserDAOImpl implements IUserDAO {
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public long save(User user) {
		Object result = sqlMapClientTemplate.insert("save", user);
		return Long.parseLong(result.toString());
	}
	
	public List<User> getUserByCondition(User user){
		return (List<User>) sqlMapClientTemplate.queryForList("getUserByCondition",user);
	}

}
