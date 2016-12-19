package com.momo.struts.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() {
		if("momo".equals(username)) {
			if("1234".equals(password)) {
				return SUCCESS;	
			}
			System.out.println("密码错误！");
		} else {
			System.out.println("用户名不存在！");
		}	
		return INPUT;	
	}

}
