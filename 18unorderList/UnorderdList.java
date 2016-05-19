package com.bridgelabz.unorderlist;
/*
 * Purpose :
 * Read The String from a file and arrange it in a SinglyLinkedlist
 * 


 */
import com.bridgelabz.filereader.FileOperations;
import com.bridgelabz.node.Node;
import java.util.Scanner;
class UnorderdList
{

    Node start;

    FileOperations obj = new FileOperations();

    // get data From a file
    void getDataFromFile()
    {
        String[] retArry = obj.fileReader();
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



    void addItem(String data)
    {
        Node head =start;
        Node temp =new Node();
        temp.data =data;
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


    void display()
    {
        Node temp =start;
        while( temp != null)
        {
            System.out.print(temp.data+"---->");
            temp=temp.next;
        }
        System.out.println(" ");
    }

    int size()
    {
        int count=0;
        Node temp =start;
        while( temp.next != null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println("sizze of Linked List"+count);
        return count;
    }

    void serchWord()
    {
        Node temp = start;
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




    void removeWord(int count)
    {
        Node temp = start;
        for(int i=0;i<count-1;i++)
        {
            temp=temp.next;
        }
        temp.next =temp.next.next;
        System.out.println("After Deleting LIst is ");
        display();
    }









    public static void main(String[] args)
    {
        UnorderdList obj1 =new UnorderdList();
        obj1.List();
        obj1.getDataFromFile();
       obj1.display();
      
       obj1.size();
       obj1.serchWord();


    }

}

