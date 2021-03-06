package com.firenay.leave.exception;

/**
 * <p>Title: LoginAcctAlreadyInUserException</p>
 * Description：更新admin时 如果检测到用户名字段重复时抛这个异常
 */
public class LoginAcctAlreadyInUserUpdateException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public LoginAcctAlreadyInUserUpdateException() {
		super();
	}

	public LoginAcctAlreadyInUserUpdateException(String message) {
		super(message);
	}

	public LoginAcctAlreadyInUserUpdateException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginAcctAlreadyInUserUpdateException(Throwable cause) {
		super(cause);
	}

	protected LoginAcctAlreadyInUserUpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
