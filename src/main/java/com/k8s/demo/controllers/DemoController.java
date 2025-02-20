package com.k8s.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController  {

	@GetMapping("/index")
	public String getIndexPage()
	{
		return "index";
	}
}
