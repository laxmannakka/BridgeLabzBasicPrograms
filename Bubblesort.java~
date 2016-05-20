package com.bridgelabz.bubblesort;
/* 
 * Created By Bridgelabz on 3-4-2016
 * <p>
 * Purpose :
 * sorting the Elements through Bubble sort
 *
 *
 *
 */




import java.util.Scanner;

class Bubblesort
{
    void get_ArrayElements() //for input array
    {
        System.out.println("Enter Array Size \n");  // taking size from user
        Scanner scan= new Scanner(System.in);
        int size = scan.nextInt();
        int intAarray[]=new int[size];
        int i;
        System.out.println("Enter Integer array Elements\n");
        for(i=0;i<size;i++)
        {
            intAarray[i] = scan.nextInt();
        }
        sorted_Elements(intAarray,size);   // calling the sorting finction
    }
    void sorted_Elements(int a[],int size)  //sorting logic
    {
        int i,j,temp;
        for(i=0;i<size;i++)
        {
            for(j=1;j<size;j++)
            {
                if(a[j-1] > a[j])
                {
                    //swap the elements!
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;	
                }
            }
        }
        display_Elements(a,size ); // calling Display function
    }
    void display_Elements(int a[],int size)
    {
        int i;
        System.out.println("Sorted Elements are \n"); 
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+ "\t");  // displaying the sorted Elements
        }


    }	

    public static void main(String args[])
    {
        Bubblesort obj=new Bubblesort();
        obj.get_ArrayElements();


    }


};
