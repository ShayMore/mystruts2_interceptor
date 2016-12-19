package com.momo.struts.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.momo.struts.action.RegisterAction;
import com.momo.struts.domain.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class RegisterInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		if(ai.getAction() != null) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			RegisterAction registerAction = (RegisterAction)ai.getAction();
			User user = registerAction.getUser();
			if(user.getUsername().contains("死")) {
				session.setAttribute("result", "用户名包含敏感词汇！");
				return Action.LOGIN;
			}
			return ai.invoke();
		}
		return Action.LOGIN;
	}

}
