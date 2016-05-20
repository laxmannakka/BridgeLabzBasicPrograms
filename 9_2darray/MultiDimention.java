package com.bridgelabz.arraytwodimensional;
/*
 * Program Created By BridgeLabz
 *<p>
 * Program on Printing Two Dimentional Array Using PrintWriter Class
 * First Step Taking Rows and Columns From User
 * based on rows and Column printing integer,double,boolean array printing
 *
 *
 */





// importing PrintWriter Class and Scanner class
import java.io.PrintWriter;
import java.util.Scanner;




public class MultiDimention 
{

    PrintWriter pw = new PrintWriter(System.out, true);


    // definaation of integer Array
    void display(int row,int column, int[][] array)
    {
        //   PrintWriter pw = new PrintWriter(System.out, true);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                array[i][j] = i*j; // asigning the Values directly
            }
        }
        pw.println("Integer Array");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)

            {
                pw.print(array[i][j]); // Printing Array
                pw.print(" ");
                pw.flush();
            }
            pw.println(" ");

        }


    }

    // defination of Double Array

    void display(int row,int column, double[][] array)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                array[i][j] = i*2;
            }
        }
        pw.println("DOuble Array ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)

            {
                pw.print(array[i][j]);
                pw.print(" ");
                pw.flush();
            }
            pw.println(" ");

        }
    }


    void display(int row,int column, boolean[][] array)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                array[i][j] = true;
            }
        }
        pw.println("Boolean Array ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)

            {
                pw.print(array[i][j]);
                pw.print(" ");
                pw.flush();
            }
            pw.println(" ");

        }

    }


    public static void main(String args[]) {
        //creating The Object of class
        MultiDimention obj =new MultiDimention ();
        //creating The Object of PrintWriter Class
        PrintWriter pw = new PrintWriter(System.out,true);

        Scanner input =new Scanner (System.in);
        pw.println("Enter How Many Rows Do u Want ");
        int row = input.nextInt();

        pw.println("Enter How Many Column Do u Want ");
        int col = input.nextInt();

        int[][]array =new int[row][col];   // integer array Declaration
        double[][] darray =new double[row][col]; // double array Declaration
        boolean[][] barray = new boolean[row][col]; // boolean Array DEclaration
        // overLoading The Display Function Here
        obj.display(row,col,array);  
        obj. display(row,col,darray);
        obj. display(row,col,barray);

    }
}
