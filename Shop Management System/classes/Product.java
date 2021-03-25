package classes;

import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity
{
	private String pid;
	private String name;
	public int availableQuantity;
	private double price;
	//public Product products[]=new Product[1000];
	
	Product(){}
	Product(String pid, String name, int availableQuantity, double price)
	{
		this.pid=pid;
		this.name=name;
		this.availableQuantity=availableQuantity;
		this.price=price;
	}
	public void setPid(String pid)
	{
		this.pid=pid;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public String getPid()
	{
		return pid ;
	}
	
	public String getName()
	{
		return name ;
	}

	public int getAvailableQuantity()
	{
		return availableQuantity ;
	}
		
	public double getPrice()
	{
		return price ;
	}

	public boolean addQuantity(int amount)
	{
		boolean f = false;
		if(amount>0)
		{
			availableQuantity=availableQuantity+amount;
			f=true;
		}
		else
		{
		    System.err.println("Amount Invalid!!! Please try again.");
		}
		return f;
	}

	public boolean sellQuantity(int amount)
	{
		boolean f= false;
		if(amount<=availableQuantity)
		{
			availableQuantity=availableQuantity-amount;
			f=true;
		}
		else
		{
		    System.err.println("Quantity not enough!!!! Please try again");
		}
		return f;
	}
	public abstract void showInfo();
}