package com.bridgelabz.powerof2;
/* 
 * Created by Bridzelabz on 2-4-2016.
 * <p>
 * Purpose:
 * 1.calculating the powers of two up to range between 0 and 31.
 * 2. and taking Range from Command Line Argumnet
 *
 */

// Importing long packge
import java.lang.Math ;


public class CalculationPower
{
    // Function For calculating Range
    void calcuLatingRange(int N)
    {
        if(N<=0 || N>=31)
        {
            System.out.println("Invalid Range");
            return;
        }

        for(int i=0;i<N;i++)
        {
            System.out.println("2^"+i+"="+(int)Math.pow(2,i));

        }
    }
			
		// Main Function
    public static void main(String []args)
    {
				// taking CommandLine Argumnet	
        int num=Integer.parseInt(args[0]);
        CalculationPower obj= new CalculationPower(); // Creating the object
        obj.calcuLatingRange(num); // calling the function
    }
}
