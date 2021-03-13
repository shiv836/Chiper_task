/*package whatever //do not write package name here */
package graphics;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Q1_first_pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		// variable to keep track of number of spaces
		int space=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			space--;
			System.out.println();
		}
		
	}
}













