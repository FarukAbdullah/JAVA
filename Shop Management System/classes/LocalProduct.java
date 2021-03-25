package classes;

import java.lang.*;

public class LocalProduct extends Product
{
	private double discountRate;

	LocalProduct(){}
	public LocalProduct(String pid, String name, int availableQuantity, double price, double discountRate)
	{
		super(pid, name, availableQuantity, price);
		this.discountRate=discountRate;
	}

	public void setDiscountRate(double discountRate)
	{
		this.discountRate=discountRate;
	}

	public double getDiscountRate()
	{
		return discountRate;
	}

	public void showInfo()
	{
	    System.out.println("Product Id Number  : "+getPid());
		System.out.println("Product Name       : "+getName());
		System.out.println("Available Quantity : "+getAvailableQuantity());
		System.out.println("Price              : "+getPrice());
		System.out.println("Discount Rate      : "+discountRate);
		System.out.println("\nThis is a Local Product");

	}
}