package classes;

import java.lang.*;


 public class ImportedProduct extends Product
 {
 	private String countryName;

 	ImportedProduct(){}
 	public ImportedProduct(String pid, String name, int availableQuantity, double price, String countryName)
 	{
 		super(pid, name, availableQuantity, price);
 		this.countryName = countryName;
 	}

 	public void setCountryName(String countryName)
 	{
 		this. countryName=countryName;
 	}

 	public String getCountryName()
 	{
 		return countryName;
 	}

 	public void showInfo()
	{
	    System.out.println("Product Id Number  : "+getPid());
		System.out.println("Product Name       : "+getName());
		System.out.println("Available Quantity : "+getAvailableQuantity());
		System.out.println("Price              : "+getPrice());
		System.out.println("Country Name       : "+countryName);
		System.out.println("\nThis is an Imported Product");
	}
}
 
 	
