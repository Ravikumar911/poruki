package com.poruki.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayloadController {

	@RequestMapping("/payload")
	public String payload(){
		return "payload/payload";
	}
}