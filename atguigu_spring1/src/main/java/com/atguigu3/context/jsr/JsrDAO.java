package com.atguigu3.context.jsr;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDAO {
	
	public void save() {
		System.out.println("JsrDAO invoked.");
	}
	
}
