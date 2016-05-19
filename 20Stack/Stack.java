package com.bridgelabz;

import com.bridgelabz.node.Node;



public class Stack<E>
{
 public   Node<E> top;
    static int count=0;


public void isEmpty()
{
    if(top == null)
    {
        System.out.println("Stack is Empty");
    }
    else
    {
        System.out.println("Stack is Not Empty");
    }
}


   public  void push( E data)
    {

        Node<E> temp= new Node();
        temp .data =data;


        if(top == null)
        {
            top=temp;

        temp .next =null;
            
        }
        else
        {

            temp.next = top;
            top=temp;
        }
        count++;
    }
    public void pop()
    {
        Node<E>top1 =top;

        if(top1 == null)
        {
            System.out.println("Stack Empty");
        
        }
        else
        {
            top1 = top1.next;
             System.out.println("\n Popped value : " +top.data);
                     top = top1;
        }
        count--;
    }
    
    public int size()
    {
        return count;
    }

    public void peek()
    {
        System.out.println("The Peek Element is "+top.data);
    }



}


           

        

