package classes;


import java.lang.*;
import interfaces.*;


public class Shop implements ProductOperations
{
	private String sid;
	private String name;
	public Product products[] = new Product [1000];
	
	public Shop(){}
	
	public Shop(String sid, String name)
	{
		this.sid = sid;
		this.name = name;
	}
		
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSid(String sid)
	{
		this.sid = sid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSid()
	{
		return sid;
	}

	public boolean insertProduct(Product p)
	{
		boolean f = false;
		for(int i=0; i<products.length; i++)
		{
		if(products[i]==null)
			{
				products[i]=p;
				f=true;
				break;
			}
		}
		return f;
	}

	public boolean removeProduct(Product p)
	{
		boolean f= false;
		try{
			for(int i=0; i<products.length; i++)
			{
				if(products[i]==p)
				{
					products[i]=null;
				    f=true;
				    break;
			    }				
		    }
		}catch(Exception ee){System.err.println("Oppps!!! This Product not found. Please try again.");}
		return f;
	}

	public Product searchProduct(String pid)
	{
		Product p=null;
		try{
			for(int i=0; i<products.length; i++)
			{
				if(products[i].getPid().equals(pid))
				{
					p=products[i];
				    break;
			    }
		   }
		}catch(Exception ee){System.err.println("Oppps!!! Product not found. Please try again.");}   
		return p;
	}
	public void showAllProducts()
	{
		try{
			for(int i=0; i<products.length; i++)
			{
				if(products[i]!=null)
				{
					products[i].showInfo();				
				    System.out.println("--------------------------------");
				    System.out.println("--------------------------------");

			    }	
		    }
		}catch(Exception ee){System.err.println("Oppps!!!  No Product found to show. Please try again.");}	
	}
}