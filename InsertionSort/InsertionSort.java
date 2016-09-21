package com.bridgelabz.sortingsearch;

/* Created by Bridgelabz on 5-4-2016
 * <P>
 * Purpose :
 * 1.Creating an array contating String.
 * 2. Sorting The Strings using Insertion Sort.
 *
 *
 */



// Importing  Scanner Class
import java.util.Scanner;


//Creating A Class

class InsertionSort
{  

    // taking InputFrom User
    void getInput( )
    {
        // Creatin the Object of Scanner Class
        Scanner in =new Scanner (System.in);

        //  Variables Size and  i is for lenght and travese
        int size,i; 

        System.out.println("Enter a String Array Size" );
        size=in.nextInt(); // reading Array Size

        String[] name = new String[size]; // Initilizing String Array

        System.out.println("Enter Names " );
        for(i=0;i<size;i++)
        {    
            // Taking Strings 
            name[i]= in.next();
        } 


        sortNames(name, size); // calling the Sorting function
    }



// logic of Sorting 
    void sortNames(String names[], int n)
     {   
         // variable I for Traversing
         int i;
        for(i=0;i<n;i++)
        {
            String temp = names[i];
            int j = i-1;
            while (j >= 0 && names[j].compareToIgnoreCase(temp) > 0) {
                names[j+1]=names[j];
                j--;
            }
            names[j+1]=temp; 
        }
        display(names ,n); // Calling Display function
    }


// display Function after sorting
    void display(String names[],int n)
    {
        System.out.println("After Sorting Names Are" );
        int i;
        for(i=0; i<n;i++)
        {
            System.out.println(names[i] );
        }
    }

   // Main Function
    public static void main(String [] args)
    {

        // Creating Object of a InsertionSort class
        InsertionSort obj =new InsertionSort();

        // calling take input Function
        obj.getInput();
    }
}
