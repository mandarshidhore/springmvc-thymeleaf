package com.sssm.springmvcthymeleaf.controller;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView getHomepage() {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", "27");
		return new ModelAndView("homepage", "model", map);
	}

	@RequestMapping("/profile")
	public ModelAndView getProfile() {
		Map<String, Object> map = new HashMap<>();
		map.put("age", 37);
		map.put("name", "Mandar");
		map.put("description", "<strong>CrossFit</strong> enthusiast");
		map.put("dateOfBirth", new GregorianCalendar(2000, 01, 01).getTime());
		map.put("languages", Arrays.asList("English", "Hindi", "Marathi"));
		return new ModelAndView("profile", "model", map);
	}

}
