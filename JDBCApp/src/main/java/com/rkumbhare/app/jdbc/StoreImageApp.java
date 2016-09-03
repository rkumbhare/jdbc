/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.jdbc;

import java.io.FileInputStream;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rkumbhare.app.jdbc.dao.EmpPhotoDao;
import com.rkumbhare.app.vo.EmpPhoto;

public class StoreImageApp {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		EmpPhotoDao empPhotoDao = appContext.getBean(EmpPhotoDao.class);
		try {
			empPhotoDao.truncate();
			empPhotoDao.insert(new EmpPhoto(1, new FileInputStream("src/main/resources/emp1.jpg")));
			empPhotoDao.insert(new EmpPhoto(2, new FileInputStream("src/main/resources/emp2.jpg")));
			empPhotoDao.insert(new EmpPhoto(3, new FileInputStream("src/main/resources/emp3.jpg")));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
