package com.study.test.interfaces;

import java.util.List;

import com.study.test.bean.User;

public interface UserInterface {

	void save(User user);

	void delete(Integer id);

	void update(User user);

	User getById(Integer id);

	int getTotalCount();

	List<User> getAll();

}
