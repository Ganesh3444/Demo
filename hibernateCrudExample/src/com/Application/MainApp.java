package com.Application;

import java.util.Scanner;

import com.service.ProductService;
import com.service.ProductServiceImpl;

public class MainApp {

	public static void main(String[] args) {

		ProductService pc = new ProductServiceImpl();

		Scanner sc = new Scanner(System.in);

		System.out.println("------------ Application Started -------------");

		while (true) {

			System.out.println("1. All Product Details");
			System.out.println("2. Show all Product Data");
			System.out.println("3. Get Single Product Data");
			System.out.println("4. Update Product Data");
			System.out.println("5. Delete Product Data");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				pc.AddProduct();

				break;

			case 2:
				pc.SelectAll();

				break;
			case 3:
				pc.GetSingleDetails();

				break;
			case 4:
				pc.UpdateProduct();

				break;
			case 5:
				pc.DeleteProduct();

				break;

			}

		}

	}

}
