package com.enigma.enigma.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigma.enigma.entity.Stock;

public interface StockDao extends JpaRepository<Stock, Integer>{

}
