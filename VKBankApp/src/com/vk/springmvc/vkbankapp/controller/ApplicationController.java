package com.vk.springmvc.vkbankapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vk.springmvc.vkbankapp.account.Namehyber;

@Controller
public class ApplicationController {
	@RequestMapping("/")
	public String HomePage() {
		return "index";
	}
	@RequestMapping("/show")
	public String Showdetails(Model model,HttpServletRequest request) {
	 String str=request.getParameter("username");
	 Namehyber nbr=new Namehyber();
	 nbr.setName(str);
	 System.out.println(str);
	 model.addAttribute("stri",str);
	 return "showdet";
	}

}
