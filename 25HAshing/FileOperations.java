package com.bridgelabz.filereader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.io. BufferedReader;

public class FileOperations
{
    String[] arr;
    int[] abc;
    public  String[] fileReader()
    {
        try
        { 
            String FullFIle = new String();

            FileReader fr =new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s = br.readLine()) != null) {

                FullFIle += s;
            }
            FullFIle = FullFIle.replaceAll("\\n"," ");
            FullFIle = FullFIle.trim();
            arr = FullFIle.split(" ");  
        }

        catch(Exception e)
        {
            // system.out.println("File Not Found"+ e.getMessage());

        }
        return arr;
    }

    public int[] integerFileReader()
    {
        try
        {
            String intFile = new String();
            FileReader fr = new FileReader("integer.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s = br.readLine()) != null) {

                intFile += s;
            }
            intFile = intFile.replaceAll("\\n",",");
            intFile = intFile.trim();
            arr = intFile.split(","); 
            abc = new int[arr.length];
            for(int i=0; i < abc.length;i++)
            {
                try
                {
                    abc[i]= Integer.parseInt(arr[i]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Exception in file reading ----------------->");
                }
            }
        }
        catch(Exception obj)
        {

            System.out.println("Exception in file reading ");
        }
        return abc;
    }

   public int [] sort(int array[])
    {
        int n = array.length;
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
}
/*
    public static void main(String[] args)
    {
        FileOperations obj =new FileOperations();
        int i;

        int [] retarray=obj.integerFileReader();
        int [] retarray1 =obj.sort(retarray);
            System.out.println("After Sorting The array is");
        for( i=0;i < retarray1.length;i++)
        {
            System.out.println(retarray1[i]);
        }
    }
}
*/








