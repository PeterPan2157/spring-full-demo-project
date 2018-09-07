package com.study.test.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.study.test.bean.User;
import com.study.test.interfaces.UserInterface;

@Repository
public class UserInterfaceImpl extends JdbcDaoSupport implements UserInterface {

//	@Autowired
//	private JdbcTemplate jTemplate;

	/*@Autowired
    void UserVODaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }*/
	
	@Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }
	
	@Override
	public void save(User u) {
		String sql = "insert into t_user(name) values(?)";
		super.getJdbcTemplate().update(sql, u.getName());
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from t_user where id=?";
		super.getJdbcTemplate().update(sql, id);
	}

	@Override
	public void update(User u) {
		String sql = "update t_user set name=? where id=?";
		super.getJdbcTemplate().update(sql, u.getName(), u.getId());
	}

	@Override
	public User getById(Integer id) {
		String sql = "select * from t_user where id=?";
		return super.getJdbcTemplate().queryForObject(sql, new RowMapper<User>() {

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
		Integer count = super.getJdbcTemplate().queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public List<User> getAll() {
		String sql = "select * from t_user";
		return super.getJdbcTemplate().query(sql, new RowMapper<User>() {

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
