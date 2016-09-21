import java.text.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
/*
* <Purpose>
* in this class perform the operation of the Regex operation if String "name" found replaces by name 
*/
class RE
{
    public static void main(String args[])
    {
        String s1="Hello <<name>> We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.Please,let us 											know in case of any clarification.Thank you. 01/01/2015";	

        String p="<<name>>"; // search pattern	
        String replaces="Laxman"; // replaces
        Pattern r=Pattern.compile(p); // pattern compiling
        Matcher m=r.matcher(s1);// comparing the data
        s1=m.replaceAll(replaces); // replacing the data
        //System.out.println(s1);

        String p2="<<full name>>"; // Search pattern
        String fname="Nakka Laxman";// replaces name
        Pattern r1=Pattern.compile(p2);
        Matcher m1=r1.matcher(s1);
        s1=m1.replaceAll(fname); // replacing the data
        //System.out.println(s1);

        String p3="91-(x){10}"; // pattern
        String Cno="91-8500819120"; // replace 
        Pattern r2=Pattern.compile(p3);
        Matcher m2=r2.matcher(s1);
        s1=m2.replaceAll(Cno);// replcing the pattern


        //System.out.println(s1);

        Date dateobj = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");

        String currentDate=df.format(dateobj);
        System.out.println(df.format(dateobj));

        Pattern r3=Pattern.compile("(\\d){2}/(\\d){2}/(\\d){4}");
        Matcher m3=r3.matcher(s1);
        s1=m3.replaceAll(df.format(dateobj));
        System.out.println(s1);

    }
}
