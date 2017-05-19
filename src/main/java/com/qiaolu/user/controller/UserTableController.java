package com.qiaolu.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qiaolu.user.pojo.User;
import com.qiaolu.user.service.UserService;


@Controller
public class UserTableController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/userList")
	public String getUserList(Model model){
		List<User> userList = userService.getUserList();
	    model.addAttribute("userList", userList);
		return "hello" ;
	}

}
