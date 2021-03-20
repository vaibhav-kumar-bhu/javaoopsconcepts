import java.lang.*;
import java.io.*;
import java.util.*;


public class Except{
	public static void main(String [] args)
	{
        try{
        
       
         try{
         	  int a=23;
         	  int b=0;
         	  int c=a/b;
         	  System.out.println(c);
         }
         catch(Exception e)
         {
         	System.out.println("number can not divided by number");
         	         	  System.out.println(e);

         }

         try{
         	 int y=Integer.parseInt("hlhjl");
         	          	  System.out.println(y);

         }
         catch(Exception e)
         {
         	         	System.out.println("NumberFormatException");         	


         	System.out.println(e);
         }
        }
        catch(Exception e)
        {
        	  System.out.println("Not Run ");
        }
        try{
         	  int []a=new int[5];
         	  a[7]=6;
         	          	  

         }
         catch(Exception e)
         {
         	         	System.out.println("NumberFormatException");       


         	System.out.println(e);
         }


	}
}