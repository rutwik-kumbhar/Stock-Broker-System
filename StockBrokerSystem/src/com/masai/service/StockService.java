package com.masai.service;

import java.util.Map;

import com.masai.entities.Stock;

public interface StockService {
	
	public String addStock(Stock st,Map<Integer,Stock> stocks);
}
