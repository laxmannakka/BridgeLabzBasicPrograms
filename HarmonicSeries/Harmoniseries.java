package com.bridgelabz.harmonicseries;

/* 
 * Created by bridgelabz on 3-5-2016
 * <p>
 * purpose :
 * Generating The HArmoic Series
 * Taking command Line Argument for calculating upto Which range
 *

 */

class HarmonicSeries
{
    public static void main(String args[])
    {   
        // takng iniput from Command line Argumnet
        int num = Integer.parseInt(args[0]);
        double result = 0.0;
        System.out.println("Harmonic Series is ");
        while(num > 0)
        {
            // logicFor Harmonic Series
            result = result + (double) 1 / num;
            System.out.print("1/"  +num+ "+ " );
          //  System.out.println(+result+ " " +1/num);
            num--;
        }
        System.out.println("");
        System.out.println("Output  is "+result);
    }
}

