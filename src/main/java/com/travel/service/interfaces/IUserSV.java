package com.travel.service.interfaces;

import java.util.List;

import com.travel.domain.User;

public interface IUserSV {
	public long save(User user);
	public List<User> getUserByCondition(User user);
}
