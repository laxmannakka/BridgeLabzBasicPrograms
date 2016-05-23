package com.bridgelabz.bankingcounter;
import com.bridgelabz.list.Queue;
import com.bridgelabz.node.Node;
import java.util.Scanner;
import java.lang.*;

class QueueMain 

{
    static int cashBal = 10000;
    public static void main(String[] args)
    {
        Queue <Integer> obj = new Queue<Integer>();


        while(true)
        {
            System.out.println("Enter Option ") ;
            System.out.println("1---Deposit ") ;
            System.out.println("2---Withdraw ") ;
            System.out.println("3--- Get Service ") ;
            System.out.println("4--- displau Queue ") ;
            System.out.println("5--- Exit ") ;
            System.out.print("Enter Option : ") ;
            Scanner input =new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice)
            {
                case 1:

                    obj.addAtFront(choice);
                    break;
                case 2:
                    obj.addAtFront(choice);
                    break;
                case 3:
                    obj.doOpearations();
                    break;

                case 4 :
                    System.out.println("Displaying Queue");
                    obj.display();
                    break;
                case 5 :
                    int cash= obj.getCashCounterBalance();
                    System.out.println("Total Cash in cash Counter "+cash);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

            }
        }

    }



}



