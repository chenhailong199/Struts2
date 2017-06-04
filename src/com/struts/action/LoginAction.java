package com.struts.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userName; //用户名
	private String password;	//密码 
	private String nextDispose;//下一个跳转到的action
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		//获取session 作用域对象
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("userName", userName);
		session.put("mes", "session");
		if (null == userName || "".equals(userName)){
			this.addFieldError("userName", "用户名不能为空");
		}
	
		if ("admin".equals(userName)){
			nextDispose = "admin"; //管理员登录
			return "success";
		} else if ("user".equals(userName)){
			nextDispose = "common"; //普通用户登录
			return "success";
		} else if ("error".equals(userName)){
			throw new NullPointerException();
		} else {
			return "failure";
		}
	}
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getNextDispose() {
		return nextDispose;
	}


	public void setNextDispose(String nextDispose) {
		this.nextDispose = nextDispose;
	}
	
}
