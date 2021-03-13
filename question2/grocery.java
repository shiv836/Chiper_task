package graphics;

import java.io.*;
import java.util.*;
public class grocery
{
	static ArrayList<item> groList=new ArrayList<>();
	public static void main(String[] args) throws IOException
	{
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your budget");
		int budget=Integer.parseInt(rd.readLine());
		while(true)
		{
			System.out.println("press 1 to add an item");
			System.out.println("press 2 to exit");
			System.out.println("enter your choice");
			int choice=Integer.parseInt(rd.readLine());
			if(choice==2)
			{
				break;
			}
			System.out.println("Enter product name");
			String product_name=rd.readLine();
			System.out.println("Enter the quantity(in KG)");
			double quantity=Double.parseDouble(rd.readLine());
			System.out.println("enter price");
			double price=Double.parseDouble(rd.readLine());
			if((budget-price)<0)
			{
			System.out.println("Can't Buy the product ###(because budget left is "+budget+")");
			}
			else
			{
			boolean avail=isPresent(product_name,quantity,price);
			if(!avail)
			{
				groList.add(new item(product_name,price,quantity));
			}
			budget-=price;
			}
			if(budget==0)
			{
				break;
			}
			System.out.println("Amount left :" + budget);
			}
		if(budget>0)
		{
			message(budget);
		}
		System.out.println("GROCERY LIST is:");
		System.out.print("Product name      ");
		System.out.print("Quantity         ");
		System.out.println("price");
		for(item t:groList)
		{
			System.out.print(t.getName()+"              ");	
			System.out.print(t.getQuantity()+"      ");
			System.out.println(t.getPrice()+"      ");	
		}
	}
	public static boolean isPresent(String name,double quant,double cost)
	{
		boolean decision=false;
		item present=null;
		for(item k:groList)
		{
			if(k.getName().equals(name))
			{
				decision=true;
				present=k;
				break;
			}
		}
		if(decision)
		{
			present.setQuantity(quant);
			present.setPrice(cost);
		}
		
		return decision;
	}
	public static void message(double budget)
	{
		double max=-1.0;
		String article="";
		for(item k:groList)
		{
		if(k.getPrice()>max && k.getPrice()<budget)
		{
			max=k.getPrice();
			article=k.getName();
		}
		}
		
		System.out.println("Amount left can buy you wheat"+ article);
			
	}

}
