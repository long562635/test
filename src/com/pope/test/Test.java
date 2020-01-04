package com.pope.test;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Test extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ActionContext ac = ActionContext.getContext();
	
	@Override
	public String execute() throws Exception {
		System.out.println("success");
		return super.execute();
	}
	
	public String doLogin() {
		Map<String, Parameter> maps = ac.getParameters();
		String username = maps.get("username").toString();
		String password = maps.get("password").toString();
		String date = maps.get("date").toString();
		
		
		System.out.println(username + " = " + password + "=" + date);
		System.out.println(Float.parseFloat(username));
		return "login";
	}

}
