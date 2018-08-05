package com.dolly;

import model.Product;
import model.ProductDAO;
import model.Supplier;

public class App {
public static void main(String args[])
{
	ProductDAO pd = new ProductDAO();
	Product p =new Product();
	p.setProductName("cycle");
	
	Product p1 =new Product();
	p1.setProductName("bike");
	
	Supplier sp =new Supplier();
	sp.setSupplierName("Dolly");
	
	pd.insertProduct(p, p1, sp);
	System.out.println("product object printed successfully");
	
	
}
}
