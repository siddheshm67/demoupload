package com.Thymeleaf.myController;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/home" ,method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "siddhesh");
		
		String dateString = new Date().toLocaleString();
		
		model.addAttribute("date", new Date().toLocaleString());
		
		System.out.println( "date : "+dateString);
		
		return"home";
	}
	
	@RequestMapping(value = "/index" ,method = RequestMethod.GET)
	public String index(Model model) {
		List<String> list = List.of("raj", "avi", "sid","nikita","bhupesh");
		model.addAttribute("list", list);
		return"index";
	}
	
	@RequestMapping(value = "/try" ,method = RequestMethod.GET)
	public String ConditionalDemo(Model model) {
		List<Integer> listNum = List.of();
		model.addAttribute("nums", listNum);
		model.addAttribute("gender", "female");
		model.addAttribute("isActive", true);
		return"try";
	}
	
	//thymeleaf fragment Demo
	
	@RequestMapping("/service")
	public String Service(Model model) {
		model.addAttribute("a", "this is title");
		model.addAttribute("b", "this is sub title");
		return"service";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		return"about";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		
		return"contact";
	}
	
	@RequestMapping("/demo")
	public String AddimgCssJs() {
		
		return"demo";
	}

}
