package com.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport implements RequestAware,
								SessionAware, ApplicationAware{
	
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> request) {
		this.request = request;	
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;	
	}
	@Override
	public void setRequest(Map<String, Object> application) {
		this.application = application;	
	}
}
