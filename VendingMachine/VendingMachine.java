/*
* Purpose :
* calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
* 1.taking array for Notes
* 2. using REcursion Calculating number of minimum Notes Return by Vending machine
*
*
*/






import java.util.Scanner;

//Creating The Class
class VendingMachine
{

    // Static Variables i for indexing the array and total for calculating the total Notes
       static int i=0;
       static int total=0;

       // Function for Calculating the notes
    int calculateFun(int money,int[]notes )
    {
        int rem;
        if(money==0)
        {
            return -1 ;
        }
            else
            {
                if(money>=notes[i])
                {
                    // logic for Calculating The notes
               int calNotes =money/notes[i];
                 rem = money%notes[i];
                money =rem;
                total += calNotes;
                System.out.println(notes[i]+   " Notes ---> " +calNotes );

                }

                i++;
                return calculateFun(money, notes);
            }
}

    
// Startting Main Function
    public static void main(String[] args)
    {
        // Creating The Object of Vending MAchine class
        VendingMachine obj =new VendingMachine();

        System.out.println("Enter Money Do U Want Count");
        Scanner input =new Scanner(System.in);
        //Initialization of New Array
        int[] notes = { 1000,500,100,50,5,2,1};

        int money =input.nextInt(); 
	 //calling calculate Function
       int retValue= obj.calculateFun(money,notes);
       System.out.println("Toatal ---Notes ---is ---"+total);
       
    }
}
