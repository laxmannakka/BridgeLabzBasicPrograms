package com.bridgelabz.polyndrome;

import com.bridgelabz.appdeque.utility;
import java.util.Scanner;


public class Polyndrome 
{
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
    Polyndrome obj =new Polyndrome();
    obj.checkPolyndrome();
}



}
