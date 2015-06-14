package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.interfaces.IUserDAO;
import com.travel.domain.User;
import com.travel.service.interfaces.IUserSV;

@Service
public class UserSVImpl implements IUserSV {
	@Autowired
	private IUserDAO userDao;
	
	public long save(User user) {
		return userDao.save(user);
	}

	public List<User> getUserByCondition(User user) {
		return userDao.getUserByCondition(user);
	}

}
