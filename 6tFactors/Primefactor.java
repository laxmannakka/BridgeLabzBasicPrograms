/* * 
 * Created by Bridzelabz on 4-5-2016.
 * <p>
 * Purpose :
 * 1.calculating factors of a number
 * 2. and picking prime numbers in that factors
 *
 *
 */


// Importing The Scanner Class
import java.util.Scanner;

class Primefactor
{
    // FUnction for Calculating The Factors
    public void Calculating_Factors(int num)
    {
        // Variavable i for Travrsing
        int i;

        System.out.println(" Prime FActors are ");

        for(i=2;i<=num;i++)
        {
            if(num%i==0)
            {   
                // Calling  The Function Check_and_printPrimeFactor
                Check_and_printPrimeFactor(i);
            }
        }



    }
    public void Check_and_printPrimeFactor(int factor)
    {
        // Declaration Of variables k and count length
        int k,count=0;

        // Assining the factor variable to length    
        int length=factor;

        for(k=1;k<=length;k++)
        {
            if(factor%k==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print( +factor+ "\t");

        }

    }
    public static void main(String [] args)
    {
        Primefactor obj = new Primefactor();
        System.out.println("Enter a Number to find Factors \n");
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        // Calling The factors Funcion
        obj.Calculating_Factors(N);


    }
}
