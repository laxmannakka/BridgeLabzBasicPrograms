package com.bridgelabz.polyndrome;

import com.bridgelabz.appdeque.utility;
import java.util.Scanner;
/*
 *<Purpose>
 * 1.In this program taking string from user 
 * 2. and put the string in queue
 * 3. checking the this string polyndrome or not
 */

public class Polyndrome 
{


    /*this function takes the string from user and store the data into queue
    *and check the string whether polyndrome or not
    */
    void checkPolyndrome()
    {
        Scanner scan =new Scanner(System.in);
        utility<Character> deqobj =new utility();
        System.out.println("Enter a String to Check Polyndrome");
        String checkString =scan.next();
        for(int i=0; i<checkString.length();i++)
        {
            char c = checkString.charAt(i);
            deqobj.addRear(c);
        }
        int count=0;
        while(deqobj.size() > 1)
        {
            if(deqobj.removeFront() != deqobj.removeRear())
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("String is Polyndrome");
        }
        else
        {
            System.out.println("String is Not Palindrome");
        }

    }

    public static void main(String[] args)
    {   
        // Creating the object of class
        Polyndrome obj =new Polyndrome();
        obj.checkPolyndrome();// calling the funtion 
    }

}
