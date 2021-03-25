package classes;

import java.lang.*;
import interfaces.*;

public class Market implements ShopOperations, EmployeeOperations
{
	public Shop shops[]=new Shop [50];
	public Employee employees[]=new Employee[100];

	public Market()
	{
		
	}
	
	public boolean insertEmployee(Employee e) 
	{
		boolean f = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i]==null)
			{
				employees[i]=e;
				f=true;
				break;
			}
		}
		return f;
	}

	public boolean removeEmployee(Employee e)
	{
		boolean f= false;
		try{
			for(int i=0; i<employees.length; i++)
			{
				if(employees[i]==e)
				{
					employees[i]=null;
				    f=true;
				    break;
			    }				
		    }
		}catch(Exception ee){System.err.println("Oppps!!! Employee not found. Please try again.");}	
		return f;
	}

	public Employee searchEmployee(String empId)
	{
		Employee e=null;
		try{
			for(int i=0; i<employees.length; i++)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e=employees[i];
				    break;
			    }
		    }
		}catch(Exception ee){System.err.println("Oppps!!! Employee not found. Please try again.");}	
		return e;
	}

	public void showAllEmoloyees()
	{
		try{
			for(int i=0; i<employees.length; i++)
			{
				if(employees[i]!=null)
				{
					System.out.println("Employee Name   :"+employees[i].getName());
				    System.out.println("Employee ID     :"+employees[i].getEmpId());
				    System.out.println("Employee Salaty :"+employees[i].getSalary());
				    System.out.println("--------------------------------");
				    System.out.println("--------------------------------");

			    }	
		    }
		}catch(Exception ee){System.err.println("Oppps!!! NO Employee found in the list to show. Please try again.");}	
	}
	
	public boolean insertShop(Shop s) 
	{
		boolean f = false;
		for(int i=0; i<shops.length; i++)
		   {
			   if(shops[i]==null)
			    {
					shops[i]=s;
				    f=true;
				    break;
			    }
		    }
		return f;
	}

	public boolean removeShop(Shop s)
	{
		boolean f= false;
		try{
			for(int i=0; i<shops.length; i++)
			{
				if(shops[i]==s)
				{
					shops[i]=null;
					f=true;
					break;
			    }				
		    }
		}catch(Exception ee){System.err.println("Oppps!!! This Shop isn't in the list. Please try again");}
		return f;
	}

	public Shop searchShop(String sid)
	{
		Shop s=null;
		try
		{
			for(int i=0; i<shops.length; i++)
			{
			if(shops[i].getSid().equals(sid))
			  {
				s=shops[i];
				break;
			  }
		    }
		}catch(Exception ee){System.err.println("Oppps!!! Shop not found. Please try again.");}
		return s;
	}

	public void showAllShops()
	{
		try{
			for(int i=0; i<shops.length; i++)
			{
				if(shops[i]!=null)
				{
					System.out.println("Shop ID      :"+shops[i].getSid());
				    System.out.println("Shop Name    :"+shops[i].getName());
				    System.out.println("--------------------------------");
				    System.out.println("--------------------------------");

			    }	
		    }
		}catch(Exception ee){System.err.println("Oppps!!! No Shop in the list to Show");}
	}

}