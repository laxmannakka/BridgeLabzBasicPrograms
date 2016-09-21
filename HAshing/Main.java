import com.bridgelabz.filereader.FileOperations;
import com.bridgelabz.order.OrderedList;
/*
*<Purpose>
* this class perform the Reading the dara from the file 
* that data storing in ascending order in Linkedlist using hashing
* 

*/

class Main
{
	// Main Start here
    public static void main(String[] args)

    {	
    	// Creation of Array of 11 Objects
        OrderedList[] order = new OrderedList[11];
		// Creating The object of File Operatons
        FileOperations object =new FileOperations();
        // Calling The Function Integer File Reader Function
        int[] retArray = object.integerFileReader();
        for(int i=0; i<retArray.length ; i++)
            {
            int rem = retArray[i] % 11;
            if(order[rem]== null)
            {
                order[rem] = new OrderedList();
                order[rem].addItem(retArray[i]);

            }
            else
                order [rem].addItem(retArray[i]);

        }
         for(int i=0;i<11;i++)0
        {
            System.out.print(i+ " ---->" );
            if(order[i] !=null)
            {
                order[i].display();
            }
	     System.out.println(" ");
        }
}
