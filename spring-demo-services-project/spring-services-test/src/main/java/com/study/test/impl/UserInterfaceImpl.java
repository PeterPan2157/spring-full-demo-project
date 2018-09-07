package com.study.test.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.study.test.bean.User;
import com.study.test.interfaces.UserInterface;

@Service
public class UserInterfaceImpl implements UserInterface {

	@Autowired
	private JdbcTemplate jTemplate;

	@Override
	public void save(User u) {
		String sql = "insert into t_user(name) values(?)";
		jTemplate.update(sql, u.getName());
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from t_user where id=?";
		jTemplate.update(sql, id);
	}

	@Override
	public void update(User u) {
		String sql = "update t_user set name=? where id=?";
		jTemplate.update(sql, u.getName(), u.getId());
	}

	@Override
	public User getById(Integer id) {
		String sql = "select * from t_user where id=?";
		return jTemplate.queryForObject(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				return user;
			}
		}, id);
	}

	@Override
	public int getTotalCount() {
		String sql = "select count(*) from t_user";
		Integer count = jTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public List<User> getAll() {
		String sql = "select * from t_user";
		return jTemplate.query(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				return user;
			}
		});
	}
}
