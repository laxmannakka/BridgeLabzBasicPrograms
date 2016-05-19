package com.bridgelabz.binarysearch;

/* Created By Bridgelabz on 5-6-2016
 * <p>
 * Purpose :
 * 1.Taking  few Nymber of Strings From User 
 * 2.Soring of those Strings
 * 3.S Enter String to Search 
 * 4.using Binary Search algoritham if String Found printing String Found
 * 5.if it not Ptinting here Entered String is not found
 *
 *
 */





// importing the Scanner Package
import java.util.Scanner;

// creating a class 
class BinarySearch
{
    //Function to take names From User 
    void getRecordData()
    {

        // variables size for How many names. and i foe travesing
        int size=0,i;  

        System.out.println("Enter a How many Names do you want store in Record ");
        //Scanner Class for taking Input
        Scanner input = new Scanner (System.in);
        size = input.nextInt();
        String names[] =new String[size]; //Initilization of String Array
        System.out.println("Enter Names "); 
        for(i=0;i<size;i++)
        {
            names[i]= input.next();
        }
        sortNames(names,size); //aftter taking array function Calling for Sorting the String array
    }


    // Sorting Logic
    void sortNames(String names[] ,int size)
    {
        String temp;
        int min=0,max=size,retValue;
        for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("After Sorting The Names ");
        for(int i=0;i<size;i++)
        {
            System.out.println(names[i]);
        }


        enterSerchdetails(names,size); // After Sorting Calling The Enter Search Function.
    }

    //Defination Of Search Function

    void enterSerchdetails( String names[],int size)
    {

        System.out.println("Enter a name to Search ");
        String key ; // for Storing Search Key
        int min=0;
        int max = size;
        int retValue;
        Scanner in =new Scanner(System.in);
        key=in.nextLine();

        retValue=searchName(names,key,min,max); // Calling The Search namesFunction
        if(retValue >= 0)
        {
        System.out.print("String Found at " +retValue);
        }
        else
        {
            System.out.println("Strng Not Found ");

    }
    }


    // defination Of serchnames Function 
    public static int searchName(String names[], String key,int min,int max)
    {
            

    int first = min;
    int last  = max;

    while (first < last) {
        int mid = (first + last) / 2;
        if (key.compareTo(names[mid]) < 0) {
            last = mid;
        } else if (key.compareTo(names[mid]) > 0) {
            first = mid + 1;
        } else {
            return mid;
        }
    }       
    return -1;
}



// main Function
public static void main(String [] args)
{
    // Creating The Object of A class.
    BinarySearch obj = new BinarySearch();
    // calling take input Function.
    obj.getRecordData( );


}
}


