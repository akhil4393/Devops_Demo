package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;

	@RequestMapping("home.htm")
	public String showForm() {
		return "welcome";
	}

	@RequestMapping("wish.htm")
	public String processForm(Map<String, Object> map) {
		String msg = null;
		// use service
		msg = service.getMessage();
		map.put("msg", msg);
		return "wish";
	}
}
