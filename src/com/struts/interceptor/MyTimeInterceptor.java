package com.struts.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyTimeInterceptor extends AbstractInterceptor{
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long startTime = System.currentTimeMillis();
		String result = invocation.invoke();
		long endTime =  System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("开始时间:"+startTime+"\t结束时间:"+endTime+"\t运行时间:"+time);
		return null;
	}
	
}
