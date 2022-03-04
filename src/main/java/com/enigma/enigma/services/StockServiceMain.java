package com.enigma.enigma.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.enigma.dao.StockDao;
import com.enigma.enigma.entity.Stock;

@Service
@Transactional
public class StockServiceMain implements StockService {
	
	@Autowired
	private StockDao stockDao;
//	List<Stock> stock_list;
//	public  StockServiceMain() {
//		stock_list = new ArrayList<>();
//		stock_list.add(new Stock(123,"Brush","idk",10, 222));
//		stock_list.add(new Stock(225,"Garlic","veg",25,200));
//	}
//	
	@Override
	public List<Stock> getStock() {
		return stockDao.findAll();
	}

	@Override
	public Stock getStock(int stockId) {
//		Stock st = null;
//		for(Stock stock:stock_list) {
//			if(stockId == stock.getId()) {
//				st = stock;
//				break;
//			}
//		}
		return stockDao.findById(stockId).get();
	}

	@Override
	public Stock addStock(Stock stock) {
//		stock_list.add(stock);
		stockDao.save(stock);
		return stock;
		
	}

	@Override
	public Stock updateStock(Stock stock) {
//		Stock st = null;
//		int i  = 0;
//		for(Stock temp:stock_list) {
//			if(stock.getId() == temp.getId()) {
//				st = stock;
//				stock_list.set(i, stock);
//				break;
//			}
//			i++;
//		}
		stockDao.save(stock);
		return stock;
	}

	@Override
	public Stock delStock(int stockId) {
		 Stock st = stockDao.findById(stockId).get();
		 stockDao.deleteById(stockId);
		 return st;
	}
	

}
