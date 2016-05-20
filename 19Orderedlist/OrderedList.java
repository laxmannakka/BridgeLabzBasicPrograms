
package com.bridgelabz.order;

/* Program on Ordererd list
 * creating a list Using the Linkedlist
 * Adding element using Ascending Order
 *
 */



import com.bridgelabz.filereader.FileOperations;
import com.bridgelabz.node.Node;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;



// Creating the class
class OrderedList<E>
{

    Node <E> start;
    FileOperations obj = new FileOperations();

    // get data From a file
    void getDataFromFile()
    {
        int[] retArry = obj.integerFileReader();
        int[] sortArray =obj.sort(retArry);
        int size =retArry.length;
        System.out.println("Array Size is "+size);
        for(int i=0;i<size;i++)
        {

            addItem(retArry[i]);
        }
    }


    // Function for Lsit
    void List()
    {
        if(start ==null)
        {
            System.out.println("List is Empty ");
        }
    }


    // add item Function 
    void addItem(Integer data)
    {
        Node<E>head = start;
        Node<E>temp = new Node();
        temp.data = (E) data;
        temp.next =null;
        if(start == null)
        {
            start = temp;
        }
        else
        {
            while(head.next != null)
            {
                head=head.next;
            }
            head.next=temp;
        }

    }

		// Display Function
    void display()
    {
        Node<E>temp =start;
        while( temp != null)
        {
            System.out.print(temp.data+"---->");
            temp=temp.next;
        }
        System.out.println(" ");
    }
     // Size of Function
    int size()
    {
        int count=0;
        Node<E>temp =start;
        while( temp.next != null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println("sizze of Linked List"+count);
        return count;
    }
 
   // Serching of a Word Function
   void serchWord()
    {
        Node<E>temp = start;
        int count=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a String to Search");
        int s =input.nextInt();
        int flag=0;
        while(temp.next != null)
        {
            count++;
            if( (Integer)temp.data == s)
            {
                System.out.println(" String found At "+count);
                flag++;
                break;

            }
            temp=temp.next;
        }

        if(flag == 1)
        {
            removeWord(count);
        }
        else
        {
            addItem(s);
            System.out.println("After Adding a LIst ");
            display(); 
        }

    }



    // removeWord From a Linked lIst
    void removeWord(int count)
    {
        Node<E>temp = start;
        if(count==1)
        {
            start =start.next;
        System.out.println("After Deleting LIst is ");

        display();
        }
        else
        {
        for(int i=0;i<count-1;i++)
        {
            temp=temp.next;
        }
        temp.next =temp.next.next;
        System.out.println("After Deleting LIst is ");
        display();
        }
    }






    public static void main(String[] args)
    {
        OrderedList<Integer> obj = new OrderedList();
        obj.getDataFromFile();
        obj.display();

        obj.size();
       obj.serchWord();



    }
}

