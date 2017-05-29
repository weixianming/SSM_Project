package com.ming.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ming.domain.User;
import com.ming.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addUser(Model model){
		model.addAttribute("user",new User());
		return "user/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(User user){
		userService.addUser(user);
		return "redirect:/user/list";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listAllUser(Model model){
		List<User> users = userService.listAllUser();
		model.addAttribute("users", users);
		return "user/list";
	}
}
