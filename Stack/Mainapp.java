package com.bridgelabz.mainstack;
import com.bridgelabz.list.Stack;
import com.bridgelabz.node.Node;
import java.util.Scanner;

/*
*<Purpose>
* thisprogram taking the expression from user checking the whether the equation balanced or not
*
*/

class Mainapp
{
    public static void main(String[] args)
    {
        Stack<Character> obj =new Stack();// cretio of object

        Scanner input =new Scanner (System.in);
        System.out.println("Enter Expression like (3*4)+(4*5) ");
        String  exp = input.next(); // reading expression
        for(int i =0; i<exp.length();i++)
        {
            char c = exp.charAt(i);// reading integer character by character
            if(c=='(' || c=='{')
                obj.push(c); // push data to stack
            if(c==')'|| c=='{')
                obj.pop(); //pop data to stack

        }
	
	// taking size and cheking if its 0 expression balanced
        int n= obj.size();
        if(n==0)
        {
            System.out.println("Expression is BAlanced ");
        }
        else
        {
            System.out.println("Expresion is Not Balanced");
        }

 }

}

