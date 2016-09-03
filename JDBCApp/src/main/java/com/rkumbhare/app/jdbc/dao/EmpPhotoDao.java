/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.jdbc.dao;

import com.rkumbhare.app.jdbc.exception.DataAccessException;
import com.rkumbhare.app.vo.EmpPhoto;

public interface EmpPhotoDao{
	public String TRUNCATE = "TRUNCATE TABLE demo.emp_photo";
	public String INSERT = "INSERT INTO demo.emp_photo(id, photo) values (?,?)";
	public String SELECT = "SELECT * FROM demo.emp_photo";
	public String SELECT_BY_ID = "SELECT * FROM demo.emp_photo where id=?";
	
	public boolean insert(EmpPhoto empPhoto) throws DataAccessException;
	public boolean truncate() throws DataAccessException;

}
