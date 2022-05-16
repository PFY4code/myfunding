package com.firenay.leave.mvc.config;

import com.firenay.leave.Admin;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


public class SecurityAdmin extends User {
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	private HttpServletRequest request;
	
	// 原始的Admin对象，包含Admin对象的全部属性 []
	private Admin originalAdmin;
	
	/**
	 * originalAdmin：传入原始的Admin对象
	 * authorities： 创建角色、权限信息的集合
	 */
	public SecurityAdmin(Admin originalAdmin, List<GrantedAuthority> authorities) {

		// 调用父类构造器
		super(originalAdmin.getLoginAcct(), originalAdmin.getUserPswd(), authorities);
		
		// 给本类的this.originalAdmin赋值
		this.originalAdmin = originalAdmin;
		
		// 将原始Admin对象中的密码擦除
		this.originalAdmin.setUserPswd(null);
		System.out.println(this.originalAdmin.getUserName() + "登录成功");
	}
	
	// 对外提供的获取原始Admin对象的getXxx()方法
	public Admin getOriginalAdmin() {
		return this.originalAdmin;
	}
}
