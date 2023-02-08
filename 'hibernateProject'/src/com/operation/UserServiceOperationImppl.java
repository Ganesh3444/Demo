 package com.operation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Products;
import com.model.User;
import com.util.HibernateUtil;

public class UserServiceOperationImppl implements UserServiceOperation{
	

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Scanner sc = new Scanner(System.in);
		
		
		@Override
		public void adduser() {
			// TODO Auto-generated method stub
			Session session = sf.openSession();
			User user = new User();
			System.out.println("Enter User Name");
			user.setUname(sc.next());
			session.save(user);
			session.beginTransaction().commit();
		
		}

		@Override
		public void addProductUsingUser() {
			// TODO Auto-generated method stub
		
			Session session = sf.openSession();
			System.out.println("Enter User Id");
			int id = sc.nextInt();
			User user = session.get(User.class, id);
			System.out.println("How Many Product Buy");
			int n = sc.nextInt();
			for(int i = 0; i<n; i++) {
				Products product = new Products();
				System.out.println("Enter Product Name");
				product.setPname(sc.next());
				System.out.println("Enter Product Price");
				product.setPrice(sc.nextDouble());
				user.getProducts().add(product);
				session.save(user);
				session.beginTransaction().commit();
			}
			
			
		}

		@SuppressWarnings("unchecked")
		@Override
		public void showAllProductUsingUser() {
			// TODO Auto-generated method stub
			Session session = sf.openSession();
			List<User> Ulist = session.createQuery("from user").getResultList(); 
			System.out.println(Ulist);
			
			
		}

		@Override
		public void getSingleUserWithAllProduct() {
			// TODO Auto-generated method stub
			
			Session session = sf.openSession();
			System.out.println("Enter User Id :");
			int id = sc.nextInt();
			User user = session.get(User.class,id);
			System.out.println(user);
			
		}

		@Override
		public void updateUser() {
			// TODO Auto-generated method stub
			Session session = sf.openSession();
			System.out.println("Enter User Id :");
			int id = sc.nextInt();
			User user = session.get(User.class,id);
			System.out.println(user);
			
			System.out.println("Enter User Name :");
			user.setUname(sc.next());
			session.update(user);
			session.beginTransaction().commit();
			
			
		}

		@Override
		public void UpdatePerticularProductUsingUser() {
			// TODO Auto-generated method stub
			
			Session session = sf.openSession();
			System.out.println("Enter user id :");
			int id = sc.nextInt();
			User user = session.get(User.class, id);
			System.out.println(user);
			
			Products products = null;
			boolean flag = false;
			
			List<Products>pList = user.getProducts();
			System.out.println("Enter product id :");
			int pid = sc.nextInt();
			for(Products p : pList) {
				if(p.getPid()== pid) {
					products = p;
					flag = true ;
					break;
				}
				
			}
			if(flag) {
				System.out.println("Enter Product Name :");
				products.setPname(sc.next());
				System.out.println("Enter Product Price :");
				products.setPrice(sc.nextDouble());
				user.getProducts().add(products);
				session.update(user);
				session.beginTransaction().commit();
				
			}
			
			
		}

		@Override
		public void deletePerticularProductUsingUser() {
			// TODO Auto-generated method stub
			
			Session session = sf.openSession();
			System.out.println("Enter user id :");
			int id = sc.nextInt();
			User user = session.get(User.class, id);
			System.out.println(user);
			
			List<Products>pList = user.getProducts();
			System.out.println("Enter product id :");
			int pid = sc.nextInt();
			
			Products products = null;
			boolean flag = false;
			
			for(Products p : pList) {
				if(p.getPid()== pid) {
					products = p;
					flag = true ;
					break;
				}
				
			}
			if(flag) {
				pList.remove(products);
				System.out.println(pList);
				user.setProducts(pList);
				session.update(user);
				session.delete(products);
				session.beginTransaction().commit();
			}
			
			
		}

		
		
		
		
		
	}

	
	

