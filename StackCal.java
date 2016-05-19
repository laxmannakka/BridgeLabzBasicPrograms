import java.io.FileReader;

import java.io.IOException;
import java.io. BufferedReader;


class Stakecal
{

    public static void main(String[] args)
    {
        try
        {
            String intFile = new String();
            FileReader fr = new FileReader("integer.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            {
            while((s = br.readLine()) != null) {
                System.out.println(" File reading Content " +s);

                intFile += s;
            }


        }
        }
        catch(Exception e)
        {
            System.out.println("Exception Found");
        }





    }
}


