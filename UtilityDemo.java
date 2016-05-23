package com.bridgelabz.app;

class UtilityDemo <E>
{
    public  E[] insertionSort( E[] array )
    {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            E key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }



    }


    public static void main(String[] args)
    {
        UtilityDemo <Integer> obj = new UtilityDemo();
        Integer arr[] = { 5,4,3,2,6};
        Integer retArray[] =obj.insertionSort(arr);
        for(int i=0; i< retArray.length;i++)
        {
            System.out.pritnln(retArray[i]);
        }


    }
}

