package com.bridgelabz.stringoperations;
/*
*<Purpose> 
*this class performs the sorting and Searching functionality
*
*/
public class SortingandSerchUtility
{   //it performs the insertion sort and returns the sorted array
    public int[]  insertionSort(int array[])
    {
        int n=array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;  
        }
        return array;
    }

    // it perform the buble sort and returns the sorted integet array
    public int[] bubbleSort(int intArray[])
    {
        int n = intArray.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(intArray[j-1] > intArray[j]){
                    //swap the elements!
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;

                }
            }
        }
        return intArray;
    }


    // this function taking String string as an argumnet 
    // and perform the bubble sort operation retuns sorted array
    public String[] bubbleSortString(String[] array)
    {
        String temp;

        // Begin For loop

        for(int i=0; i<array.length; i++) {

            //Open For loop

            for(int j=0; j<array.length-1-i; j++) {

                //Open If Statement Compare and sort strings

                if(array[j].compareTo(array[j+1])>0) {

                    temp = array[j];

                    array[j] = array[j+1];

                    array[j+1] = temp;

                }//End of If Statement

            }//End of For Loop

        }//End of For Loop
        return array;
    }


    // function for insertion sort 
    public String[] insertionString(String[] Array)
    {
        int i;
        for(i=0;i<Array.length;i++)
        {
            String temp = Array[i];
            int j = i-1;
            while (j >= 0 && Array[j].compareToIgnoreCase(temp) > 0) {
                Array[j+1]=Array[j];
                j--;
            }
            Array[j+1]=temp;
        }
        return Array;
    }

    // binary search of array 
    public void  binarySerch(int[] array, int item)
    {

        int num =array.length;

        int first = 0;
        int last = num - 1;
        int middle = (first + last)/2;

        while( first <= last )
        {
            if ( array[middle] < item )
                first = middle + 1;
            else if ( array[middle] == item )
            {
                System.out.println(item + " found at location " + (middle + 1) + ".");
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(item + " is not found.\n");
    }
    
    // function for binary search of String if element found return the element or else return -1 
    public int  binarySerch(String[] array ,String c)
    {

        int first = 0;
        int last  =array.length;
        while (first < last) 
        {
            int mid = (first + last) / 2;
            if (c.compareTo(array[mid]) < 0) 
            {
                last = mid;
            } 
            else if (c.compareTo(array[mid]) > 0) 
            {

                first = mid + 1;
            }  
            else
            {
                return mid;
            }
        }
        return -1;
    }


}






