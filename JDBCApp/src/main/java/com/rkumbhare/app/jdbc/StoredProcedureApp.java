/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.jdbc;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;

public class StoredProcedureApp {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		JdbcTemplate jdbcTemplate = appContext.getBean(JdbcTemplate.class);
		Object result = jdbcTemplate.execute("{?=call sum(?,?)}", new CallableStatementCallback<Object>() {
			@Override
			public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
				cs.setInt(2, 20);
				cs.setInt(3, 40);
				cs.registerOutParameter(1, Types.NUMERIC);
				cs.execute();
				return cs.getObject(1);
			}
		});
		
		appContext.close();
	}

}
