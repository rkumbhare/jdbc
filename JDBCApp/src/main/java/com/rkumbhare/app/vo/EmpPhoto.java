/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.vo;

import java.io.InputStream;

public class EmpPhoto {
	private int id;
	private InputStream photo;

	public EmpPhoto(int id, InputStream photo) {
		this.id = id;
		this.photo = photo;
	}
	public EmpPhoto() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public InputStream getPhoto() {
		return photo;
	}
	public void setPhoto(InputStream photo) {
		this.photo = photo;
	}

}
