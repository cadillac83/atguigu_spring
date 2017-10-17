package com.atguigu3.context.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

//@Service
@Named
public class JsrServie2 {
	
//	@Resource
//	@Inject
	private JsrDAO jsrDAO;
	
//	@Resource
	@Inject
	public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("JsrServie2 init.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("JsrServie2 destroy.");
	}

	public void save() {
		jsrDAO.save();
	}
	
}
