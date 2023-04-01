package com.masai;

import java.util.Map;
import java.util.Scanner;

import com.masai.entities.Stock;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.exceptions.StockException;
import com.masai.service.StockService;
import com.masai.utility.Admin;
import com.masai.utility.IdGenration;

public class Main {

	public static void adminLogin(Scanner sc) throws InvalidDetailsException {

		System.out.print("Enter Your User Name : ");
		String userName = sc.next();
		System.out.println("Enter Your Password");
		String password = sc.next();

		if (userName.equals(Admin.username) && password.equals(Admin.password)) {
			System.out.println("Successfully Login");
		} else {
			throw new InvalidDetailsException("Invalid Admin Credentials");
		}

	}

	public static String adminAddStock(Scanner sc, Map<Integer, Stock> stocks, StockService stockservice) {

		String str = null;

		System.out.println("please enter the Stock details");
		System.out.print("Enter the stock name : ");
		String name = sc.next();
		System.out.print("Enter the stock qty : ");
		int qty = sc.nextInt();
		System.out.println("Enter the stock price : ");
		double price = sc.nextDouble();
		System.out.println("Enter the stock category");
		String cate = sc.next();

		Stock st = new Stock(IdGenration.genrateId(), name, qty, price, cate);
		str  = stockservice.addStock(st, stocks);
		return str;
	}
	
	public static void adminViewAllStocks(Map<Integer, Stock> stocks, StockService stockservice)
			throws StockException {
		stockservice.viewAllStocks(stocks);
	}
	
	public static void adminDeleteProduct(Scanner sc, Map<Integer, Stock> stock, StockService stockservice)
			throws StockException {

		System.out.println("please enter the id of product to be deleted");
		int id = sc.nextInt();
		stockservice.deleteStock(id, stock);
	}
	
	
	public static String adminUpdateStock(Scanner sc, Map<Integer, Stock> products, StockService stockservice)
			throws StockException {
		String result = null;
		System.out.print("please enter the id of the stock which is to be updated : ");
		int id = sc.nextInt();
		System.out.print("Enter the updated details : ");

		System.out.print("Enter the product name : ");
		String name = sc.next();

		System.out.print("Enter the  product qty : ");
		int qty = sc.nextInt();

		System.out.print("Enter the product price : ");
		double price = sc.nextDouble();

		System.out.print("Enter the product category : ");
		String cate = sc.next();

		Stock update = new Stock(id, name, qty, price, cate);

		result = stockservice.updateStock(id, update, products);
		return result;
	}
	
	public static void main(String[] args) {

	}

}
