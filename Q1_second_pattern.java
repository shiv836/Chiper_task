package graphics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Q1_second_pattern
{
	public static void main(String[] args)
	{
		//variable c to keep track of character
		char c='A';
		//variable space to keep track of spaces
		int space=4;
		for(int i=1;i<=5;i++)
		{
			// loop to print spaces
			for(int j=1;j<=2*space;j++)
			{
				System.out.print(" ");
			}
			// loop to print characters
			for(int k=1;k<=i;k++)
			{
				System.out.print(c+" ");
				// updating to subsequent characters
				int update=c+1;
				c=(char)update;
			}
			System.out.println();
			
			space--;
		}
	}
}


