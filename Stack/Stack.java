package com.bridgelabz.list;

import com.bridgelabz.node.Node;



public class Stack<E>
{
 public   Node<E> top;
    static int count=0;

// function isEmpty it will check whether the list is empty or not
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

  // this funtion add the data to stack
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
   // this function delete the data from stack
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
    
   // this function returns the size
    public int size()
    {
        return count;
    }

   //this function shows the peek element of stack
    public void peek()
    {
        System.out.println("The Peek Element is "+top.data);
    }

}


           

        

