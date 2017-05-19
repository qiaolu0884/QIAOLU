package com.qiaolu.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入门程序
 * @author qiaolu
 *
 */
@RestController
public class HelloWorldController {
	@RequestMapping(value ="/hello")
	public String hello(){
		System.out.println("hello");
		return "hello world";
	}
	

}
