package com.bridgelabz.hello;
/* *
 * Created by bridelabz on 2-4-2016
 *<p>
 *purpose :
 * in this code taken username from user.
 * if it is less than three characters the program will exit from main.
 * or else printing Hello and that String ,how r u .


 */




import java.util.Scanner;
import java.io.*;

class Hello
{ 
   // Here The function Check the String Length is three or not 
	void check_And_Print(String name)
	{

		if(name.length()<=3)
		{
			System.out.println("Enter a Valid Username"  );
			return;
		}

		System.out.println(" Hello  " + name + ", How are You"  );
	}

 // start the main function
	public static void main( String [] args)
	{
		System.out.println("Enter a User name ");

		// Creating The object of Scanner Class
		Scanner scan= new Scanner(System.in);

			// Reading name 
		String name = scan.next();

   // Creation of object of class
		Hello obj= new Hello();

		// Calling The Check and Print Function
		obj.check_And_Print(name);

	}
}




