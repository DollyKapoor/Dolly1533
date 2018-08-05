package com.d;

import model.Product;
import model.ProductDAO;
import model.Supplier;

public class App {
public static void main(String args[])
{
	ProductDAO pd = new ProductDAO();
	Product p =new Product();
	p.setPname("mkhk");
	p.setPcost(800);

	
	Product p1 =new Product();
	p1.setPname("coffee");
	p1.setPcost(80);

	Supplier sp =new Supplier();
	sp.setSupplierName("Dolly2n");
	pd.insertProduct(p);
	pd.insertProduct(p1);
	pd.getProducts();
	//pd.updateProduct(p1);
	//pd.deleteProduct(p1);
	
	System.out.println("product object printed successfully");
	
	
}
}
