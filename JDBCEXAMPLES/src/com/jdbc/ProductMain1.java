package com.jdbc;

import java.util.List;

public class ProductMain1 
{
	public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
		int createResult = dao.createProducttable();
		System.out.println("Table creation status..."+createResult);
	}
}
class ProductMain2
{
	public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
		Product product1 = new Product();
		product1.setProId("B123");
		product1.setProName("Boost");
		product1.setProPrice(1240.50);
		
		int result = dao.saveProduct(product1);
		if(result == 1)
		{
			System.out.println("Data Inserted Successfully.....");
		}
		else
		{
			System.out.println("Data Insertion Fail Check Once.....");
		}
	}
}

class ProductMain3
{
	public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
		Product product = dao.findById("B123");
		if(product != null)
		{
			System.out.println("Product Available......");
			System.out.println(product.getProId()+"--"+product.getProName()+"--"+product.getProPrice());
		}
		else
		{
			System.out.println("Product is not Available");
		}
	}
}

class ProductMain4
{
	public static void main(String[] args)
	{ 
		ProductDao dao = new ProductDao();
		List<Product> products = dao.findAll();
		products.forEach(product->System.out.println(product));
	}
}


class ProductMain5
{
	public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
		int count = dao.updateProduct(200,5);
		System.out.println("update records are..."+count);
	}
}

class ProductMain6
{
	public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
		int count = dao.deleteProductById("A123");
		System.out.println("delete records are..."+count);
	}
}

class ProductMain7
{
  public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
		int count = dao.deleteProductByPrice(200);
				System.out.println("delete records count.."+count);
	}
}

class ProductMain8
{
  public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
		int count = dao.droptable();
				System.out.println("drop status.."+count);
	}
}

