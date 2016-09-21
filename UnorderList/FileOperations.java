package com.bridgelabz.filereader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.io. BufferedReader;

/*
* <Purpose>
* this class read the data from file
* and it will sort the strings
* 
*/

public class FileOperations
{
    String[] stringarray;
    int[] integetarray;

    // this functiion reads the file from local data
    public  String[] fileReader()
    {
        try
        { 
            String filedata = new String();

            FileReader fr =new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {

                filedata += line;
            }
            filedata = filedata.replaceAll("\\n"," ");
            filedata = filedata.trim();
            stringarray = filedata.split(" ");  
        }

        catch(Exception e)
        {}
        return stringarray;
    }


        // this function reads the integer data from file
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
            // replace all the \n with comma
            intFile = intFile.replaceAll("\\n",",");
            intFile = intFile.trim();
            stringarray = intFile.split(","); 
            integetarray = new int[stringarray.length];
            for(int i=0; i < integetarray.length;i++)
            {
                try
                {
                    integetarray[i]= Integer.parseInt(stringarray[i]);
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
        // retrun the integer array
        return integetarray;
    }
    

    // function for sort using the insertion sort 
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
        // returning the sorted array
        return array;
    }
}




