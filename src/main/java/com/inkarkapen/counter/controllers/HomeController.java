package com.inkarkapen.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("count")
public class HomeController {
	@ModelAttribute("count")
	public int getCount() {
		return 0;
	}
	@RequestMapping("/")
    public String index(@ModelAttribute("count") int count, Model model) {
		count = count +1;
		model.addAttribute("count", count);
        return "index";
    }
    @RequestMapping("/count")
    public String setSession(@ModelAttribute("count") int count, Model model){
    		//count = count +1;
        model.addAttribute("count", count);
        return "counter";
    }
}
