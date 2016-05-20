package com.bridgelabz.powerof2;
/* 
 * Created by Bridzelabz on 2-4-2016.
 * <p>
 * Purpose:
 * 1.calculating the powers of two up to range between 0 and 31.
 * 2. and taking Range from Command Line Argumnet
 *
 */

// Importing java.
import java.lang.Math ;


public class Power
{
    // Function For calculating Range
    void calculatingRange(int N)
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
        Power obj= new Power();
        obj.calculatingRange(num);


    }
}
