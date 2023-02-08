package com.admin;

import java.util.Scanner;

import com.operation.UserServiceOperation;
import com.operation.UserServiceOprationImppl;

public class AppTest {

public static void main(String[] args) {
	
	
	UserServiceOperation us = new UserServiceOprationImppl();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("--------- Application Start ----------");
	
	
	System.out.println("1: Add user");
	System.out.println("2: Add Product Using User");
	System.out.println("3: Show All Product Using User");
	System.out.println("4: Get Single User With All Products");
	System.out.println("5: Update User");
	System.err.println("6: Update Perticular Product Using User");
	System.out.println("7: Delete Perticular Product Using User");
	
	
	int ch = sc.nextInt();
	switch (ch) {
	case 1:
		us.adduser();
	break;	
	
	case 2:
		us.addProductUsingUser();
		break;	
		
	case 3:
		us.showAllProductUsingUser();
		break;	
		
	case 4:
		us.getSingleUserWithAllProduct();
		break;	
		
	case 5:
		us.updateUser();
		break;	
		
	case 6:
		us.UpdatePerticularProductUsingUser();
		break;	
		
	case 7:
		us.deletePerticularProductUsingUser();
		break;	
		
	}
	
	}
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	

