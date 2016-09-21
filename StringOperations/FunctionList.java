package com.bridgelabz.deffunc;
import com.bridgelabz.stringoperations.SortingandSerchUtility;
import java.util.Scanner;
/* 
 *<Purpose>
 *this class having utility functions
 *it takes the string and integet arrays and return to calling function

 */
public class FunctionList
{   
    // object of scanner class
    Scanner input =new Scanner(System.in);
    // Creating the object of sorting and searchig utility which is located in packe 
    SortingandSerchUtility obj =new SortingandSerchUtility();
    // function for takeing the input array
    public int[] takeIntegerArray()
    {
        System.out.println("Enter array size ");
        int size =input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Elements ");
        for(int i=0 ; i<size ; i++)
        {
            array[i]=input.nextInt();
        }
        return array; // returning the array
    }
    // function for the take string 
    public String[] takeString()
    {
        System.out.println("String Methode Calling ");
        System.out.println("Enter a String");
        String str = input.next();
        String[] Array =new String [str.length()];
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            Array[i] = ""+c;
        }
        return Array; // returning string array
    }


    // Function for inserton sort of integers
    public void insertionSortofInteger()
    {
        int[] iArray = takeIntegerArray();
        // calling the insertionSort function it will returns the Sorted array
        int[] retArray = obj.insertionSort(iArray);
        // calling the display function
        display(retArray);
    }

    // Bubble sort of Integers
    public void bubbleSortInt()
    {
        int[] bArray = takeIntegerArray();
        int[] bretArray =obj.bubbleSort(bArray);
        display(bretArray);
    }
    // display Integer array
    void display(int[] dispArray)
    {
        System.out.println("After Sorting Elements are");

        for(int i=0; i<dispArray.length ;i++)
        {
            System.out.println(""+dispArray[i]);
        }
    }
    // display String array function
    void display(String[] dispArray)
    {
        System.out.println("After Sorting String are");

        for(int i=0; i<dispArray.length ;i++)0
        {
            System.out.println(""+dispArray[i]);
        }
    }
    // function for bubble sort of string
    public void bubbleSortofString() 
    {
        String[] Array =takeString(); // this function call returns the string array
        String[] retArray = obj.bubbleSortString(Array); // sorting the array
        display(retArray); //displaying the array
    }

    public void insertionSortofString()
    {
        String[] Array =takeString(); // calling the get string funtion
        String[] retArray = obj.insertionString(Array); // insertion sort calling the function it will return the array
        display(retArray); // calling the display function
    }
    // function for binary search
    public void binarySerchofInt()
    {
        int[] Array = takeIntegerArray(); // calling the functio of Integer Array
        int[] bretArray =obj.bubbleSort(Array); // calling the function for Bubble sort
        System.out.println("Enter a Element To Serch ");
        int key = input.nextInt();
        obj.binarySerch(bretArray, key); // calling the searching function
    }
    
    // function for binary search
    public void   biarySerchofString()
    {
        String[] Array =takeString();
        String[] retArray = obj.bubbleSortString(Array);
        System.out.println("Enter Character To Serch ");
        String c = input.next(); 
        int ret= obj.binarySerch(retArray ,c);
        if(ret >0)
            System.out.println("String Found At "+ret);
        else
            System.out.println("String Not Found ");
    }

}































