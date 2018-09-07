package com.study.test.utils;

import java.io.InputStream;
import java.util.Properties;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Util {
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;

	private static ComboPooledDataSource dataSource;

	private static JdbcTemplate jTemplate;

	static {
		// C3P0的连接池设定
		try {
			// 1.准备连接池
			dataSource = new ComboPooledDataSource();
			Properties props = new Properties();
			// Reader in = new FileReader("db.properties");
			InputStream in = C3p0Util.class.getClassLoader().getResourceAsStream("jdbc.properties");
			props.load(in);

			driver = props.getProperty("test.driver");
			url = props.getProperty("test.url");
			user = props.getProperty("test.user");
			pwd = props.getProperty("test.password");

			dataSource.setDriverClass(driver);
			dataSource.setJdbcUrl(url);
			dataSource.setUser(user);
			dataSource.setPassword(pwd);
			// 2.创建JDBC模板对象
			jTemplate = new JdbcTemplate();
			jTemplate.setDataSource(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int update(String table, String value) {
		// 3.书写sql，并执行
		String sql = "insert into t_user values(null,'babdd')";
		return jTemplate.update(sql);

	}
}
