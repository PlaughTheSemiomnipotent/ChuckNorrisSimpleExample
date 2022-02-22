package com.MDI747.ChuckNorrisQuote.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class QuoteServiceImpl implements QuoteService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public QuoteServiceImpl () {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getRandomQuote() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}

}
