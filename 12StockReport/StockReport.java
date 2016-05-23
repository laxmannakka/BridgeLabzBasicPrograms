import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
 import java.util.ArrayList;

class StockReport
{
    void readshareFromUser()
    {
        System.out.println("Enter How Many Shares do u Want to store "); 
        Scanner input =new Scanner(System.in);
        int size =input.nextInt();
        ArrayList<String> name = new ArrayList<String>();

        int[] price = new int[size];
        int[] number = new int [size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter Share Name Price and no of Shares ");
            name.add(input.next());
            price[i] =input.nextInt();
            number[i] =input.nextInt();
        }
        displayShares(name,price,number,size);
        }
        void displayShares( ArrayList<String> name,int[] price,int[] number,int size)
        {
            System.out.println(" Available Share Details are ");
                System.out.println("Share-Name \t Price \t Quntity");
            for(int i=0;i<size;i++)
            {
                System.out.println( name.get(i)+ " \t\t  " +price[i]+ "\t  " +number[i] );
            }
            calculatingPrice(name,price,number,size);

        }
        void calculatingPrice(ArrayList<String>name, int[] price,int[] number,int size)
        {
            System.out.println(" Toatal Price  ");
                System.out.println("Share-Name \t Price \t Quntity \tTotal-Price");
            for(int i=0;i<size;i++)
            {
                System.out.println( name.get(i)+ " \t\t  " +price[i]+ "\t  " +number[i]+ "\t\t" +(price[i]*number[i]) );
            }
        }



public static void main(String[] args)
{
    StockReport obj =new StockReport();
 obj.readshareFromUser();
}
}




