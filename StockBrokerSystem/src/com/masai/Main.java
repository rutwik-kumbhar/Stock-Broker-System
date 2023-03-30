package com.masai;

import java.util.Map;
import java.util.Scanner;

import com.masai.entities.Stock;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.service.StockService;
import com.masai.utility.Admin;

public class Main {
	
	public static void adminLogin(Scanner sc) throws InvalidDetailsException{
		
		System.out.print("Enter Your User Name : ");
		String userName = sc.next();
		System.out.println("Enter Your Password");
		String password = sc.next();
		
		if(userName.equals(Admin.username) && password.equals(Admin.password)){
			System.out.println("Successfully Login");
		}else {
			throw new InvalidDetailsException("Invalid Admin Credentials");
		}
		
	}
	
	public static String adminAddStock(Scanner sc, Map<Integer, Stock> stoks, StockService stservice) {
		
		String str = null;
		
		return str;
	}
	
	
	public static void main(String[] args) {
		
	}

}
