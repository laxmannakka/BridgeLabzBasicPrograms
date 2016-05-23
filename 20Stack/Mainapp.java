package com.bridgelabz.mainstack;
import com.bridgelabz.list.Stack;
import com.bridgelabz.node.Node;
import java.util.Scanner;



class Mainapp
{
    public static void main(String[] args)
    {
        Stack<Character> obj =new Stack();

        Scanner input =new Scanner (System.in);
        System.out.println("Enter Expression like (3*4)+(4*5) ");
        String  exp = input.next();
        for(int i =0; i<exp.length();i++)
        {
            char c = exp.charAt(i);
            if(c=='(' || c=='{')
                obj.push(c);
            if(c==')'|| c=='{')
                obj.pop();

        }

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

