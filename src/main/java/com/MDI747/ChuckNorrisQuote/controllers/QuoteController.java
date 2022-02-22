package com.MDI747.ChuckNorrisQuote.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MDI747.ChuckNorrisQuote.services.QuoteService;

@Controller
public class QuoteController {
	private final QuoteService quoteService;
	
//	@Autowired // optional
	public QuoteController(QuoteService quoteService) {
		this.quoteService = quoteService;
	}
	
	@RequestMapping({"/", ""})
	public String showQuote(Model model) {
		model.addAttribute("joke", quoteService.getRandomQuote());
		return "index";
	}
}
