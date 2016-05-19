package com.bridgelabz.mainsort;
import java.util.Scanner;
import com.bridgelabz.deffunc.functionList;
class MainApp
{

    public static void main(String[]args)
    {
        Scanner in =new Scanner(System.in);
        String abc="";
        long startTime=0,endTime=0,totalTime=0;
        functionList obj =new functionList();
        do
        {
            System.out.println("1----Inserino Sort for Integers");
            System.out.println("2----Inserino Sort for String");
            System.out.println("3----Bubble sort for Integers");
            System.out.println("4----Bubble Sort for String");
            System.out.println("5----Binary Search for Integers");
            System.out.println("6----Binary Search for String");

            int choice = in.nextInt();
            switch(choice)
            {
                case 1 : startTime = System.currentTimeMillis();
                         obj.insertionSortofInteger();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds"+totalTime);
                         break;
                case 2 :
                         startTime = System.currentTimeMillis();
                         obj.insertionSortofString();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds"+totalTime);
                         break;
                case 3: 
                         startTime = System.currentTimeMillis();
                         obj. bubbleSortInt();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds"+totalTime);
                         break;

                case 4 :
                         startTime = System.currentTimeMillis();
                         System.out.println("AM in Swich Case ");
                         obj.bubbleSortofString();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds"+totalTime);
                         break;
                case 5:
                         startTime = System.currentTimeMillis();
                         obj.binarySerchofInt();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds"+totalTime);
                         break;
                case 6:
                         startTime = System.currentTimeMillis();
                         obj.biarySerchofString();
                         endTime   = System.currentTimeMillis();
                         totalTime = (endTime - startTime)/1000;
                         System.out.println("TotalTime Elapsed to Execute the Function in Seconds"+totalTime);
                         break;

            }
            System.out.println("Press any Key to Continue \n Press E to exit");
            abc=in.next();
        }
        while(!abc.equals("E"));
    }
}










