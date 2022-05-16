package com.firenay.leave.constant;

/**
 * <p>Title: LeaveConstant</p>
 * Description：
 * date：2020/5/8 19:11
 */
public class LeaveConstant {

	public static final String MESSAGE_LOGIN_FAILED = "Account or password input error! Please re-enter";

	public static final String MESSAGE_LOGIN_ACCT_ALREADY_IN_USE = "Sorry, this account has already been used!";

	public static final String MESSAGE_ACCESS_FORBIDEN = "Please login to visit again!";

	public static final String MESSAGE_STRING_INVALIDATE = "The string is not legal, please do not pass the empty string";

	public static final String MESSAGE_SYSTEM_ERROR_LOGIN_NOT_UNIQUE = "System error: Login account is not unique!";

	public static final String MESSAGE_NOT_LOGGED = "Sorry, you must be logged in before you can do this!";

	public static final String MESSAGE_FIRENAY = "MyFunding";

	public static final String MESSAGE_ACCESS_DENIED = "Sorry! You cannot access this resource!";

	public static final String MESSAGE_CODE_NOT_EXISTS = "The verification code has expired, please check your phone number or resend it!";

	public static final String MESSAGE_CODE_INVALID = "Captcha is incorrect!";

	public static final String ATTR_PHONE_INVALID = "Wrong cell phone number or email input!";

	public static final String ATTR_USER_NAME_INVALID = "Username cannot be empty!";

	public static final String MESSAGE_HEADER_PIC_UPLOAD_FAILED = "Header image upload failed";

	public static final String MESSAGE_HEADER_PIC_EMPTY = "Figure cannot be empty!";

	public static final String MESSAGE_DETAIL_PIC_EMPTY = "Image cannot be empty!";

	public static final String MESSAGE_DETAIL_PIC_UPLOAD_FAILED = "Image upload failed";

	public static final String MESSAGE_TEMPLE_PROJECT_MISSING = "Object is lost";

	/**
	 * 页面中从这个值获取异常信息NotloggedException
	 */
	public static final String ATTR_NAME_EXCEPTION = "exception";

	public static final String ATTR_NAME_LOGIN_ADMIN = "loginAdmin";

	/**
	 * session 共享的用户对象
	 */
	public static final String ATTR_NAME_LOGIN_MEMBER = "loginMember";

	public static final String ATTR_ADMIN_EDIT = "admin";

	public static final String ATTR_ADMIN_ID = "AdminID";

	public static final String REDIS_CODE_PREFIX = "REDIS_CODE_PREFIX_";

	/**
	 * 用于管理员查询分页
	 */
	public static final String ATTR_NAME_PAGE_INFO = "pageInfo";

	public static final String ATTR_NAME_MESSAGE = "message";

	public static final String ATTR_NAME_TEMPLE_PROJECT = "tempProject";

	public static final String ATTR_NAME_PORTAL_DATA = "portal_data";
}
