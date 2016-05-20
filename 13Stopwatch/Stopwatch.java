package com.bridgelabz.stopwatch;
/* 
 * created By Bridgelabz on 4-5-2015
 * <p>
 * Purpose :
 * 1 generating stop watch by taking system time by millisecons 
 * 2.And Calculating th Differance Between Start time and End Time
 *
 *
 *
 */




import java.util.Scanner;
public class Stopwatch 
{ 
    // Variable Start used to store Start Time
    private static long start;

    // Creating The Constructer for Stopwatch and calulating the Starting Time 
    public void startStopwatch() 
    {

        // getting Current time in Milli Seconds
        System.out.println("Stopwatch is Started ");
        start = System.currentTimeMillis();

    } 

    //This  Function calculating The Elapsed time
    public double elapsedTime() 
    {      

        // Getting Currnt Time After ExeCuting The Loop
        long now = System.currentTimeMillis();

        //Returning elapsed time in seconds
        return (now - start) / 1000.0;  
    }


    public static void main(String[] args) 
    {

        // Creating The Object of Stopwatch Class
        Stopwatch timer1 = new Stopwatch();
        Scanner input =new Scanner(System.in);
         double elapsedtime = 0;
        System.out.println("Press 1 for Start Stop watch ");
         int choice =input.nextInt();
        if(choice == 1)
        {
            timer1.startStopwatch();
        }
        System.out.println("Press 2 for Start Stop watch ");
        choice=input.nextInt();
        if(choice == 2)
        {

            // calling Function of elpsedtime and Storing The return Value in Variable elpsetime 
             elapsedtime=timer1.elapsedTime();
        }
            if(elapsedtime >60 )
            {
                int minute = (int)elapsedtime/60;
                int  seconds = (int)elapsedtime%60;
            System.out.println(" Elapsed time  \n MInutes   Seconds   \n " +minute+ "\t" +seconds );

            }
            else
            {
               
            System.out.println(" Elapsed time in Seconds  " +elapsedtime);
            }
        }
    }

 



