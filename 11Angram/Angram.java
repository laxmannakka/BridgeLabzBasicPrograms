
package com.bridgelabz.angram;

/* 
* Created By Bridgelabz on 09/05/2016
* <p>
* Purpose :
* Checking Angram Strings or not 
    1.Taken two Strings From User
    2.Sorting The Strings
    3.checking Angram or Not
*
*
*/


// improting the Scanner class

import java.util.Scanner;



class Angram
{
    //The Function sortStrings 
    String  sortStrings(String wordSt )
    {
        // taking character Array
        char[] word=wordSt.toCharArray();

        for(int i=0;i<(word.length-1);i++)
        {

            for(int j=i+1;j>0;j--)
            {
                if(word[j]<word[j-1])
                {
                    char temp=word[j-1];
                    word[j-1]=word[j];
                    word[j]=temp;
                }
            }
        }

        // String.valueof function is taken char array as input and it will give string
        wordSt=String.valueOf(word);

        //return the string
        return wordSt;


    }


    // Function For checking Angram Or Not
    public static void  isAngram(String string1,String string2)
    {

        // checking The String lengths here
        if(string1.length() ==string2.length())
        {
            // checking two strings are equal or not
            if(string1.equals(string2))
            {
                System.out.println("Entered Strings angram ");
            }
        }
        else
            System.out.println("not a Angram");
    }



    // Main Function
    public static void main(String [] args)
    {  
        // Creating the Object of Scanner class
        Scanner inputSting = new Scanner(System.in);
        
        System.out.println("Enter a First String ");
        //Reading String From User
        String  string1 =inputSting.nextLine();
        
        //creating the object of Angram class 
        Angram object =new Angram();
        
        // calling The Function sortStrings and storing the Return Value in s1
        String s1 = object. sortStrings(string1);
         
         System.out.println("Enter a Second  String ");
       
        // Reading Second String 
        String  string2 = inputSting.nextLine();
        
        // calling The Function sortStrings and storing the Return Value in s1
        String s2 = object. sortStrings(string2);
         
         // Callng the Function isAngram 
         isAngram(s1,s2);


    }
}
