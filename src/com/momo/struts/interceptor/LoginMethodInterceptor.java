package com.momo.struts.interceptor;

import com.momo.struts.action.LoginAction;
import com.momo.struts.util.StringTool;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

@SuppressWarnings("serial")
public class LoginMethodInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation ai) throws Exception {
		System.out.println("进入到方法拦截器...");
		Object object = ai.getAction();
		if(object != null) {
			LoginAction loginAction = (LoginAction)object;
			String username = loginAction.getUsername();
			String password = loginAction.getPassword();
			if(StringTool.isEmpty(username)) {
				System.out.println("用户名为空");
				return Action.INPUT;
			}
			if(StringTool.isEmpty(password)) {
				System.out.println("密码为空");
				return Action.INPUT;
			}
		}
		return ai.invoke();
	}

}
