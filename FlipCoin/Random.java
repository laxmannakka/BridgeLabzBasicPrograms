package com.bridgelabz.random;

/* Program On Flip Coins
* 1. Number of turns  get from user
* 2. And we are Generating random Numbers.
* 3. it less than 0.5 incrementing the tail
* 4. if Greater Than Incrementing the head
* 5. calculating The Percentage ocuurance  of head and tail
*/


//importing The Scanner Class
import java.util.Scanner;


class Random
{
    public static void main(String [] args)
     {

        int head=0,tail=0,num,i;
        System.out.println("Enter a Number Of Flips \n");
        Scanner scan= new Scanner(System.in);
        num= scan.nextInt(); // Reading The Number of Flips

        if(num<1){
            System.out.println("Invalid input");
            return;
        }

        for(i=0;i<num;i++)
        {
            // generating the random number
             double value= Math.random();
            if(value<0.5)
                tail++;
            else
                head++;
        }
        System.out.println("Number of tails is \t "  +tail);
        System.out.println("Number of heads is \t " +head);
        System.out.println("Head Percentage is \t");
				// calculating The Percentage Of head Occurance
        head=(100*head)/num;
        System.out.println( +head+" %");
			
        System.out.println("tail Percentage is \t");
				// Calculating The Percentage of Tail Ocurance
        tail=(100*tail)/num;
        System.out.println(  +tail+" %");

    }
}
