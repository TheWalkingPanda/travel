package com.travel.dao.interfaces;

import java.util.List;

import com.travel.domain.User;

public interface IUserDAO {
	public long save(User user);
	public List<User> getUserByCondition(User user);
}
