/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.jdbc.exception;

@SuppressWarnings("serial")
public class DataAccessException extends Exception {

	public DataAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataAccessException(String message) {
		super(message);
	}

	public DataAccessException(Throwable cause) {
		super(cause);
	}

}
