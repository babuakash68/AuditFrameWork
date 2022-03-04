package com.enigma.enigma.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enigma.enigma.entity.Stock;

@Service
public interface StockService {
	
	public List<Stock> getStock();
	public Stock getStock(int stockId);
	public Stock addStock(Stock stock);
	public Stock updateStock(Stock stock);
	public Stock delStock(int stockId);

}