
package com.bridgelabz.coupongeneration;
/*
 * created by Bridgelabz on 04/05/2016
 * <p>
 * Purpose:
 * Generating Distinct coupon numbers
 */
import java.util.Scanner;
import java.util.ArrayList;

public class CouponNumber{

    public static void main(String []args)
    {
        int num,temp,temp1;

        ArrayList<Integer> mylist= new ArrayList<Integer>(10);
        Scanner scan=new Scanner(System.in);
      
        //Input no of distinct coupons
        System.out.print("Enter Total Distinct Coupon : ");
        num=scan.nextInt();
       
        //Cenerating and checking coupons
        while(num>0)
        {
            int flag=0;
            //generating random numbers
            temp=(int)(Math.random()*10000); 
            double size=mylist.size();
            //checking that generated number is not in list or not
            for(int i=0;i<mylist.size();i++)
            {
                temp1=mylist.get(i);
                if(temp1==temp)
                {
                    flag=1;
                    break;
                }
            }
            //if generated number is not in list then it will be added
            if(flag==0){
                mylist.add(temp);
            }
            else{
                num++;
            }
            num--;
        }
        //Displaying all Coupons
        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

    }

}
