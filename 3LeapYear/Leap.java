package com.bridgelabz.leap;

/*
 * Created by Bridgelabz on 2-4-2016.
 * <p>
 * Purpose:
 * This Program to calculate the Leap year
 *
 *    
 */





// import the Scanner Function    
import java.util.Scanner; 

// creation of class
class Leap
{

    // Function Defination of Check Leap Year
    void Check_leap_year(int year)
    {  

        if((year % 400 == 0)||((year % 4 == 0)&&(year%100 != 0))  ) 
            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year " + year + " is not a leap year");
    }


    // Main Function
    public static void main(String args[])
    { 

        System.out.println("Enter a Year \n");
        // Reading input
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        Leap obj=new Leap();
        // calling Function
        obj.Check_leap_year(year);

    }
}

