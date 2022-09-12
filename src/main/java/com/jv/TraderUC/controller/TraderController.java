package com.jv.TraderUC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jv.TraderUC.domain.Trader;
import com.jv.TraderUC.service.TraderService;

@RestController
@RequestMapping
public class TraderController {
	
	@Autowired
	private TraderService service;


	// get all the traders
	@GetMapping("/trading/traders/all")
	public List<Trader> getTraders() {
		// return list;
		return this.service.getTraders();
	}

	// get a specific trader using mail ID
	@GetMapping("/trading/traders")
	public ResponseEntity<Object> getTrader(@RequestParam("email") String email) {
		return this.service.getTrader(email);
	}

	// Create new trader
	@PostMapping("/trading/traders/register")
	public ResponseEntity<Object> addTrader(@RequestBody Trader t) {
		return this.service.addTrader(t);
	}

	// Updating name of the trader
	@PutMapping("/trading/traders")
	public ResponseEntity<Object> updateName(@Validated @RequestBody Trader t) {
		return this.service.updateName(t);
	}
	
	// Add money to the account
	@PutMapping("/trading/traders/add")
	public ResponseEntity<Object> addBal(@Validated @RequestBody Trader t) {
		return this.service.addBal(t);
	}
}
