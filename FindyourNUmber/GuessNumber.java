
package com.bridgelabz.guessnumber;
/*
* Program Created By Brodgelabz
* <p>
* Purpose:
* Finding The User Expected Number 
* 1. Range Taken From Command Line Argument
* 2.using Binary Serch Algoritham Finding The Expected Number.
*
*

*/


// importing Scanner Class
import java.util.Scanner;

class GuessNumber
{    
    // Main Methode
    public static void main( String [] args)
    {
        System .out.println("Enter a Number range you are Expecting ");
        int range = Integer.parseInt(args[0]);
        int min =0;

	// Function Calling 
        findNumber(min,range-1);

    }

        
    // Function For Finding The Find NUmber 

    static int  findNumber(int min,int max)
    {
        int mid = (min+max)/2;
        System.out.println(" press 1 Expecting  range" +min+ "-------" +mid );
        System.out.println(" press 2 Expecting  range" +(mid+1)+ "--------" +max); 
        Scanner in =new Scanner (System.in);
        int choice = in.nextInt();
        if(min>max)
            return 0;
        if(max==min)
        {
            System.out.println("YOur Expecting Number is"+min);
            return 0;
        }
        if (choice ==2)
        {

            findNumber(mid+1,max); // Function Calling Recursively

        }
        if(choice == 1)
        {
            findNumber(min,mid); // Function Calling Recursively
        }
        return 0;
    }
}
