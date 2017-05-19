package com.qiaolu.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qiaolu.user.pojo.User;
import com.qiaolu.user.service.UserService;

 
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/user/list")
	public List<User> getUserList(Model model){
		List<User> list = userService.getUserList();
//		model.addAttribute("list", list);
		return list ;
	}

}
