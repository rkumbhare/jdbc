/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rkumbhare.app.jdbc.exception.DataAccessException;
import com.rkumbhare.app.vo.EmpPhoto;

@Repository
public class EmpPhotoDaoImpl implements EmpPhotoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean insert(EmpPhoto empPhoto) throws DataAccessException {
		return jdbcTemplate.execute(INSERT, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, org.springframework.dao.DataAccessException {
				try {
					ps.setInt(1, empPhoto.getId());
					ps.setBinaryStream(2, empPhoto.getPhoto());
					System.out.println("EmpPhoto is inserted");
					return ps.execute();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Failed to insert EmpPhoto");
					throw e;
				}
			}
		});
	}

	@Override
	public boolean truncate() throws DataAccessException {
		try {
			jdbcTemplate.update(TRUNCATE);
			System.out.println("truncate table EmpPhoto");
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

}
