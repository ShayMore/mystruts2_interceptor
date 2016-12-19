package com.momo.struts.action;

import com.momo.struts.domain.User;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport {
	
	private User user;
	private String pwdretype;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}	
	
	public String getPwdretype() {
		return pwdretype;
	}

	public void setPwdretype(String pwdretype) {
		this.pwdretype = pwdretype;
	}
	
	public String execute() {
		if(!user.getPassword().equals(pwdretype)) {
			return LOGIN;
		}
		return SUCCESS;
	}

}
