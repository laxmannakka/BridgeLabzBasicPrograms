package com.bridelabz.sort.utility;

import com.bridelabz.sort.utility.Utility;

import java.util.Scanner;

public class mainClass
{
    static void inputArray(int Array[],int size)
    {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter Array Elements ");
        for(int i=0;i<size;i++)
        {
            Array[i]=in.nextInt();

        }
    }
    static void display(int[] Array,int size)
    {
    for(int i=0;i<size;i++)
    {
        System.out.print(Array[i]);
        System.out.print("\t");
    }
    }

    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int size = in.nextInt();
        int [] Array =new int[size];

        System.out.println("1--insertion Sort ");
        System.out.println("Enter Choice ");
        int choice =in.nextInt();
        switch(choice)
        {
            case 1 : inputArray(Array,size);
            Utility inn =new Utility();
                     inn.insertionSort(Array);
                    display(Array,size);
        }
    }
}
