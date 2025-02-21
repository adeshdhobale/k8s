package com.k8s.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController  {

	@GetMapping("/index")
	@ResponseBody
	public String getIndexPage()
	{
		return "index";
	}
}
