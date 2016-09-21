package com.bridgelabz.list;
/*
 * Created by bridgelabz
 * Purpose :
 * Read The String from a file and arrange it in a SinglyLinkedlist
 * 
 */
import com.bridgelabz.filereader.FileOperations;
import com.bridgelabz.node.Node;
import java.util.Scanner;
class UnorderdList<E>
{
    Node<E> start; // Starting node
    FileOperations obj = new FileOperations();

    // get data From a file
    void getDataFromFile()
    {
        String[] stringarray = obj.fileReader();
        int size =stringarray.length;
        System.out.println("Array Size is "+size);
        for(int i=0;i<size;i++)
        {
            addItem(stringarray[i]);
        }
    }


    // Function for List
    void list()
    {
        if(start ==null)
        {
            System.out.println("List is Empty ");
        }
    }


    // adding the node to list
    void addItem(String data)
    {
        Node<E> head =start;
        // creating the temparary nide
        Node<E> temp =new Node();
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

    // this function display the list
    void display()
    {
        Node<E> temp =start;
        while( temp != null)
        {
            System.out.print(temp.data+"---->");
            temp=temp.next;
        }
        System.out.println(" ");
    }

    // this function gives the size of the list
    int size()
    {
        int count=0;
        Node<E> temp =start;
        while( temp.next != null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println("sizze of Linked List"+count);
        return count;
    }

    // this function search word from list
    void serchWord()
    {
        Node<E> temp = start;
        int count=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a String to Search");
        String s =input.next();
        int flag=0;
        while(temp.next != null)
        {
            temp=temp.next;
            count++;
            if (temp.data.equals(s))
            {
                System.out.println(" String found At "+count);
                flag++;
                break;

            }
        }

        if(flag == 1)
        {
            removeWord(count);
        }
        else
        {
            addItem(s);
            display(); 
        }

    }



    // remove the node from list
    void removeWord(int count)
    {
        Node<E> temp = start;
        for(int i=0;i<count-1;i++)
        {
            temp=temp.next;
        }
        temp.next =temp.next.next;
        System.out.println("After Deleting LIst is ");
        display();
    }



    // main function
    public static void main(String[] args)
    {

        // Creating the object of Unorder List
        UnorderdList<String> object =new UnorderdList();
        // Calling the list function it will check whether list is empty or not   
        object.list();
        // this functon reads the data from server
        object.getDataFromFile();
        // this function display the list
        object.display();
        // display the size      	
        object.size();
        // search the word from list
        object.serchWord();


    }

}

