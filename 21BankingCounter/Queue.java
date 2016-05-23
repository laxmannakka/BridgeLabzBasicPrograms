package com.bridgelabz.list;
import com.bridgelabz.node.Node;
import java.util.Scanner;


public class Queue<E>
{
    Scanner input = new Scanner (System.in);
    static int cashBal =10000;
    public  Node<E> front ;
    public static   int COUNT;


    // function For Adding The Queue
    public void addAtFront(E data)
    {
        Node<E> temp = new Node();
        temp.data = (E) data;
        temp.next = null;
        if(front == null)
        {
            front =temp;
        }
        else
        {
            Node <E> temp1 = front;
            while(temp1.next != null)
            {
                temp1=temp1.next;
            }
            temp1.next=temp;

        }
    }


    // Delete The Queue
    public void deleteAtRear()
    {
        Node<E> front1 = new Node();
        front1=front;
        if(front == null)
        {
            System.out.println("Sorry queue is Empty ");
        }

        else
        {
            front=front.next;

        }
        COUNT--;
    }


    // function For Size
    public int size()
    {
        return COUNT;
    }

    // Function for operations withdraw and Deposit
    public void doOpearations()
    {

        int count= size();

        while(front != null)
        {
            System.out.println("Tranactions Going on");


            if((Integer)front.data == 1)
            {
                System.out.println("Enter How Much Money Do U Want Deposit ");
                int money = input.nextInt();
                cashBal += money;
                System.out.println( "user Deposit Succesfully "+money);
                deleteAtRear();

            }
            else if((Integer)front.data == 2)
            {
                System.out.println("Enter How Much Money Do U Want Withdraw");
                int money =input.nextInt();
                if(money<cashBal)
                {
                    cashBal -= money;
                    System.out.println( "user Withdrawn Succesfully " +money);
                    deleteAtRear();
                }
                else
                    System.out.println("Cash Counter Empty");
            }


        }



    }

    public void display(){
        Node<E> front1 =front;
        if(front1==null)
        {
            System.out.println(" Queue Is Empty ");
        }
        else
        {
            while(front1!=null)
            {
                System.out.print(front1.data+"  ");
                front1 =front1.next;
            }
        }
    }
    
    public int  getCashCounterBalance()
    {
        return cashBal;
    }



}




