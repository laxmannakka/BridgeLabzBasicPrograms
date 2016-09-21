package com.bridgelabz.indexszerocheck;
/* 
 * Created by Bridgelabz on 4-5-2016
 * <p>
 * Purpose :
 * Taking an Array and the checking the three elements is equals to zero. 
 * if the Three Elements are zero then Printing the Elements. 
 *
 *
 */



// importing Scanner Class
import java.util.Scanner;


class Triplet
{

    // Get Array  Function  Defination
    void getArray(int Array[],int length)
    { 
        int i;
        System.out.println("Enter  Array Elements \n");
        Scanner in =new Scanner(System.in);
        for(i=0;i<length;i++)
        {
            int lvalue = in.nextInt();
            Array[i] =lvalue;
        }

        // Calling The Check Triplet Function
        checkTriplet(Array,length);
    }


    // Defination of Check Triplet Function
    void checkTriplet(int Array[],int length)
    {
        System.out.println("Checking Triplet ");
        int i,j,k,count=0;
        for(i=0;i<length-2;i++)
        {
            j=i+1;
            k=j+1;

            if(Array[i] +Array[j] +Array[k] ==0)
            { 
                count++;
                System.out.println("Triplet NUmbers add to zero is Found \n");
                System.out.print(" " +Array[i]+ "\t");
                System.out.print(" "+Array[j]+ "\t");
                System.out.print(" " +Array[k]+ "\t");
            }
        }
        if(count==0)
        {
            System.out.println("Triplet NOt Found ");
        }
    }
    // Main Function
    public static void main(String[] args)
    {
        System.out.println("Enter Array Size \n");
        Scanner in =new Scanner (System.in);

        int arraySize= in.nextInt();      // Reading Array Size
        int Array[] =new int [arraySize];  // declaration of Array

        Triplet obj =new Triplet();  // Creating The Object
        // Caling Get Array FUnction 
        obj.getArray(Array,arraySize);
    }
}

