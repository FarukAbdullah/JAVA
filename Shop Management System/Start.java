import java.lang.*;

import classes.*;
import fileio.*;
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		Shop sp=new Shop();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean repeat=true;

		System.out.println("********************************");
		System.out.println("   Welcome to Group-2 Project   ");
		System.out.println("********************************");
		System.out.println();
		System.out.println("Enter Y for entering the system N for Exit");
		String ch=sc.next();
		if(ch.equals("Y") || ch.equals("y"))
		{
			while(repeat)
		{
			System.out.println("\nWhat do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Shop Management");
			System.out.println("3. Shop Product Management");
			System.out.println("4. Product Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("*****************************************");
					System.out.println("   Your Choice is: Employee Management   ");
					System.out.println("*****************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							
							System.out.println("*****************************************");
							System.out.println("   Your Option is: Insert New Employee   ");
							System.out.println("*****************************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee(name1,empId1,salary1);
							
							if(m.insertEmployee(e1)){System.out.println("\nEmployee Inserted... ID: "+empId1);}
							else{System.err.println("\nOops... Something is Wrong...");}
							
							System.out.println();
							
							break;
							
						case 2:
							
							System.out.println("**********************************************");
							System.out.println("   Your Option is: Remove Existing Employee   ");
							System.out.println("**********************************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = m.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(m.removeEmployee(e2)){System.out.println("\nEmployee Removed...... ID: "+e2.getEmpId());}
								else{System.err.println("\nOops... Something is Wrong...");}
							}
							else{System.out.println();}
							
							System.out.println();
							
							break;


						
						case 3:
							
							System.out.println("****************************************");
							System.out.println("   Your Option is: Show All Employees   ");
							System.out.println("****************************************");
							System.out.println();
							
							m.showAllEmoloyees();
							
							break;
						
						case 4:
							
							System.out.println("****************************************");
							System.out.println("   Your Option is: Search an Employee   ");
							System.out.println("****************************************");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = m.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("\nEmployee Found...........\n");
								System.out.println("Employee Id: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else{System.out.println();}
							
							System.out.println();
							
							break;

							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.err.println("           Invalid Option          ");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					
					System.out.println();
					break;
					
				case 2:
					
					System.out.println("*************************************");
					System.out.println("   Your Choice is: Shop Management   ");
					System.out.println("*************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Shop");
					System.out.println("2. Remove Existing Shop");
					System.out.println("3. Show All Shops");
					System.out.println("4. Search a Shop");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
							
							System.out.println("*************************************");
							System.out.println("   Your Option is: Insert New Shop   ");
							System.out.println("*************************************");
							System.out.println();
							
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							System.out.print("Enter Shop Name: ");
							String sname1 = sc.next();
							
							Shop s1 = new Shop(sid1,sname1);
							
							if(m.insertShop(s1)){System.out.println("\nShop inserted.. SID: "+s1.getSid());}
							else{System.err.println("\nOops... Something is Wrong...");}
							
							System.out.println();
							
							break;
							
						case 2:
							
							System.out.println("******************************************");
							System.out.println("   Your Option is: Remove Existing Shop   ");
							System.out.println("******************************************");
							System.out.println();
							
							System.out.print("Enter Shop Id: ");
							String sId2 = sc.next();
							
							Shop s2 = m.searchShop(sId2);
							
							if(s2 != null)
							{
								if(m.removeShop(s2)){System.out.println("\nShop Removed...... ID: "+s2.getSid());}
								else{System.err.println("\nOops... Something is Wrong...");}
							}
							else{System.out.println();}
							
							System.out.println();
							
							break;
							
													
						case 3:
							
							System.out.println("************************************");
							System.out.println("   Your Option is: Show All Shops   ");
							System.out.println("************************************");
							System.out.println();

							m.showAllShops();
							
							break;
						
						case 4:
							
							System.out.println("***********************************");
							System.out.println("   Your Option is: Search a Shop   ");
							System.out.println("***********************************");
							System.out.println();

							System.out.print("Enter Shop SID: ");
							String sId3 = sc.next();
							
							Shop s3 = m.searchShop(sId3);
							
							if(s3 != null)
							{
								System.out.println("\nShop Found...........\n");
								System.out.println("Shop Id: "+s3.getSid());
								System.out.println("Shop Name: "+s3.getName());
							}
							else{System.out.println();}
							
							System.out.println();
							
							break;
							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("           Invalid Option          ");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					System.out.println();
					break;
					
				case 3:
					
					System.out.println("**********************************************");
					System.out.println("    Your Choice is: Shop Product Management   ");
					System.out.println("**********************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Product");
					System.out.println("2. Remove Existing Product");
					System.out.println("3. Show All Products");
					System.out.println("4. Search a Product");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							
							System.out.println("****************************************");
							System.out.println("   Your Option is: Insert New Product   ");
							System.out.println("****************************************");
							System.out.println();
							
							System.out.println("There are Two Types of Product: \n");
							System.out.println("1. Local Product");
							System.out.println("2. Imported Product");
							System.out.println("3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							Product p = null;
							
							if(type == 1)
							{
								System.out.println("\nYour Type is: Local Product\n");
								
								System.out.print("Enter Product ID: ");
								String pid1 = sc.next();
								System.out.print("Enter Product Name: ");
								String pname1 = sc.next();
								System.out.print("Available Quantity: ");
								int quantity = sc.nextInt();
								System.out.print("Enter Price: ");
								double price = sc.nextDouble();
								System.out.print("Enter discount rate: ");
								double disrate = sc.nextDouble();

								LocalProduct lp = new LocalProduct(pid1,pname1,quantity,price,disrate);
								
								p = lp;
								
							}
							else if(type == 2)
							{
								System.out.println("\nYour Type is: Imported Product\n");
								
								System.out.print("Enter Product ID: ");
								String pid1 = sc.next();
								System.out.print("Enter Product Name: ");
								String pname1 = sc.next();
								System.out.print("Available Quantity: ");
								int quantity = sc.nextInt();
								System.out.print("Enter Price: ");
								double price = sc.nextDouble();
								System.out.print("Enter Country Name: ");
								String cname = sc.next();
								
								ImportedProduct ip = new ImportedProduct(pid1,pname1,quantity,price,cname);
								
								p = ip;
								
							}
							else if(type == 3)
							{
								System.out.println("Your Type is to Go Back");
							}
							else
							{
								System.err.println("Inavlid Type...........");
							}
							
							if(p != null)
							{
								System.out.print("Enter Shop ID: ");
								String sid1 = sc.next();
								
								Shop s1 = m.searchShop(sid1);
								
								if(s1 != null)
								{
									if(s1.insertProduct(p)){System.out.println("\nProduct inserted....");}
									else{System.err.println("\nProduct Not Inserted");}
								}
								else{System.err.println("\nOops Someting is Worng");}
							}
							
							
							break;
							
						case 2:
							
							System.out.println("*********************************************");
							System.out.println("   Your Option is: Remove Existing Product   ");
							System.out.println("*********************************************");
							System.out.println();

							System.out.print("Enter Product Id: ");
							String pid2 = sc.next();
							
							Product p2 = sp.searchProduct(pid2);
							
							if(p2 != null)
							{
								if(sp.removeProduct(p2)){System.out.println("\nProduct Removed...... ID: "+p2.getPid());}
								else{System.err.println("\nOops... Something is Wrong...");}
							}
							else{System.out.println();}
							
							System.out.println();
							
							break;
						
						case 3:
							
							System.out.println("***************************************");
							System.out.println("   Your Option is: Show All Products   ");
							System.out.println("***************************************");
							System.out.println();
							
							sp.showAllProducts();
							
							break;
						
						case 4:
							
							System.out.println("**************************************");
							System.out.println("   Your Option is: Search a Product   ");
							System.out.println("**************************************");
							System.out.println();
							
							System.out.print("Enter Product ID: ");
							String pid4 = sc.next();
							
							
							Product p4 = sp.searchProduct(pid4);
							
							if(p4 != null)
							{
								System.out.println("\nProduct Found");
							}
							else{System.out.println("\nNo Product Found");}
												
							break;
							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("          Invalid Option           ");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					System.out.println();
					break;
					
				case 4:
					
					System.out.println("***********************************************");
					System.out.println("   Your Choice is: Product Quantity Add-Sell   ");
					System.out.println("***********************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Add Product");
					System.out.println("2. Sell Product");
					System.out.println("3. Show Add & Sell History");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("    Your Option is: Add Product    ");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Shop ID: ");
							String sId4 = sc.next();
							
							sp = m.searchShop(sId4);
							
							if(sp != null)
							{
								System.out.print("Enter Product ID: ");
								String pid5 = sc.next();
								
								Product p5 = sp.searchProduct(pid5);
								
								if(p5 != null)
								{
									System.out.print("Enter Quantity: ");
									int qnty = sc.nextInt();
									System.out.println("Current Available Quantity: "+p5.getAvailableQuantity());
									if(p5.addQuantity(qnty))
									{
										System.out.println("Adding Amount: "+ qnty + "  Successfull ");
										System.out.println("New Available Quantity: "+p5.getAvailableQuantity());
										frwd.writeInFile(qnty + " has been Added in "+ p5.getPid());
									}
									else{System.out.println("Oops Something is Worng");}
								}
							}
							
							break;
							
						case 2:
							
							System.out.println("************************************");
							System.out.println("    Your Option is: Sell Product    ");
							System.out.println("************************************");
							System.out.println();
							
							System.out.print("Enter Shop ID: ");
							String sId5 = sc.next();
							
							sp = m.searchShop(sId5);
							
							if(sp != null)
							{
								System.out.print("Enter Product ID: ");
								String pid6 = sc.next();
								
								Product p6 = sp.searchProduct(pid6);
								
								if(p6 != null)
								{
									System.out.print("Enter Quantity: ");
									int qnty1 = sc.nextInt();
									System.out.println("Current Available Quantity: "+p6.getAvailableQuantity());
									if(p6.sellQuantity(qnty1))
									{
										System.out.println("Selling Amount: "+ qnty1 + "  Successfull ");
										System.out.println("New Available Quantity: "+p6.getAvailableQuantity());
										frwd.writeInFile(qnty1 + " has been Sold in "+ p6.getPid());
									}
									else{System.out.println("Oops Something is Worng");}
								}
							
							}
							
							break;
						
						case 3:
							
							System.out.println("**********************************************");
							System.out.println("   Your Option is: Show Add & Sell HIstory    ");
							System.out.println("**********************************************");
							
							frwd.readFromFile();
							System.out.println();
							
							break;
				
							
						case 4:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("         Invalid Option            ");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					
					System.out.println();
					break;
					
				case 5:
					
					repeat = false;
					System.out.println("************************************");
					System.out.println("   Thank You for Using Our System   ");
					System.out.println("************************************");
					System.out.println();
					break;
					
				default:
				
					System.out.println("******************************");
					System.out.println("         Invalid Choice       ");
					System.out.println("******************************");
					System.out.println();
					break;
			}
		}
			
		}
		else if(ch.equals("N") || ch.equals("n"))
		{
			System.out.println("Thank You");
		}
		else 
		{
			System.err.println("Wrong Input!!! Please Try Again.");
		}
	}
}



