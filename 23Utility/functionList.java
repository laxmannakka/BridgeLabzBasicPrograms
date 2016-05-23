package com.bridgelabz.deffunc;
import com.bridgelabz.stringoperations.SortingandSerchUtility;
import java.util.Scanner;

public class functionList
{
    Scanner input =new Scanner(System.in);
    SortingandSerchUtility obj =new SortingandSerchUtility();

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
        return array;
    }

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
        return Array;
    }



    public void insertionSortofInteger()
    {
        int[] iArray = takeIntegerArray();

        int[] retArray = obj.insertionSort(iArray);
        display(retArray);
    }


    public void bubbleSortInt()
    {
        int[] bArray = takeIntegerArray();
        int[] bretArray =obj.bubbleSort(bArray);
        display(bretArray);
    }

    void display(int[] dispArray)
    {
        System.out.println("After Sorting Elements are");

        for(int i=0; i<dispArray.length ;i++)
        {
            System.out.println(""+dispArray[i]);
        }
    }
    void display(String[] dispArray)
    {
        System.out.println("After Sorting String are");

        for(int i=0; i<dispArray.length ;i++)
        {
            System.out.println(""+dispArray[i]);
        }
    }

    public void bubbleSortofString() 
    {
        String[] Array =takeString();
        String[] retArray = obj.bubbleSortString(Array);
        display(retArray);
    }

    public void insertionSortofString()
    {
        String[] Array =takeString();
        String[] retArray = obj.insertionString(Array);
        display(retArray);
    }
    
    public void binarySerchofInt()
    {
        int[] Array = takeIntegerArray();
        int[] bretArray =obj.bubbleSort(Array);
        System.out.println("Enter a Element To Serch ");
        int key = input.nextInt();
       obj.binarySerch(bretArray, key);
    }
    
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

    

        














  



 





