package com.enigma.enigma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.enigma.enigma.entity.Stock;
import com.enigma.enigma.services.StockService;

@RestController
public class Controller {
	
	@Autowired
	public StockService stockService;
	
	@GetMapping("/stocks")
	public List<Stock> getStock() {
		return this.stockService.getStock(); 
	}
	
	@GetMapping("/stocks/{stockId}")
	public Stock getOneStock(@PathVariable String stockId) {
		return this.stockService.getStock(Integer.parseInt(stockId));
	}
	
	@PostMapping("/stocks")
	public Stock addStock(@RequestBody Stock stock) {
		return this.stockService.addStock(stock);

	}
	@PutMapping("/stocks")
	public Stock updateStock(@RequestBody Stock stock) {
		return this.stockService.updateStock(stock);
	}
	
	@DeleteMapping("/stocks/{stockId}")
	public Stock delOneStock(@PathVariable String stockId) {
		return this.stockService.delStock(Integer.parseInt(stockId));
	}
}
