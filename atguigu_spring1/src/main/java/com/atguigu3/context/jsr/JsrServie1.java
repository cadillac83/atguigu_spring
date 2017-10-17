package com.atguigu3.context.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrServie1 {
	
//	@Resource
	private JsrDAO jsrDAO;
	
	@Resource
	public void setJsrDAO(JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("JsrServie1 init.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("JsrServie1 destroy.");
	}

	public void save() {
		jsrDAO.save();
	}
	
}
