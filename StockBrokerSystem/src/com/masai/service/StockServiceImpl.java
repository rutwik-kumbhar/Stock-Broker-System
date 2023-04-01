package com.masai.service;

import java.util.Map;

import com.masai.entities.Stock;
import com.masai.exceptions.StockException;

public class StockServiceImpl implements StockService {

	@Override
	public String addStock(Stock st, Map<Integer, Stock> stocks) {
		stocks.put(st.getId(), st);
		return "Stock added successfully";
	}

	@Override
	public void viewAllStocks(Map<Integer, Stock> stocks) throws StockException {
		// TODO Auto-generated method stub
		if (stocks != null && stocks.size() > 0) {
			for (Map.Entry<Integer, Stock> me : stocks.entrySet()) {
				System.out.println(me.getValue());
			}

		} else {
			throw new StockException("Product List is empty");
		}
	}

	@Override
	public void deleteStock(int id, Map<Integer, Stock> stocks) throws StockException {
		// TODO Auto-generated method stub
		if (stocks != null && stocks.size() > 0) {

			if (stocks.containsKey(id)) {
				stocks.remove(id);
				System.out.println("Stock deleted successfully");

			} else {
				throw new StockException("Product not found");
			}

		} else {
			throw new StockException("Product list is empty");
		}
		
	}

	@Override
	public String updateStock(int id, Stock st, Map<Integer, Stock> stocks) throws StockException {
		// TODO Auto-generated method stub
		if (stocks != null && stocks.size() > 0) {

			if (stocks.containsKey(id)) {
				stocks.put(id, st);
				return "Product has successfully updated";
			} else {
				throw new StockException("Product not found");
			}

		} else {
			throw new StockException("Product list is empty");
		}
	}

}
