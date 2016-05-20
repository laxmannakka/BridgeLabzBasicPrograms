import com.bridgelabz.filereader.FileOperations;
import com.bridgelabz.order.OrderedList;


class Main
{

    public static void main(String[] args)

    {
        OrderedList[] order = new OrderedList[11];

        FileOperations object =new FileOperations();
        int[] retArray = object.integerFileReader();
        for(int i=0; i<retArray.length -1; i++)
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
        

        for(int i=0;i<10;i++)
        {
            System.out.println(i );
            if(order[i] !=null)
            {
                order[i].display();
            }
        }



        



        //if(retArray


//        System.out.println(retArray[0]);
  //      System.out.println(retArray[1]);
    //    System.out.println(retArray[2]);
    }

}
