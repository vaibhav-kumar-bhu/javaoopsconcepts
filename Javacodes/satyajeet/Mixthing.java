
import java.lang.*;
import java.util.*;
import java.io.*;

public class Mixthing
{
	public static void main(String [] args)
	{
		  Scanner scan=new Scanner(System.in);
		  int n=scan.nextInt();
		  scan.nextLine();
		  String s=scan.nextLine();
		  Double d=scan.nextDouble();
		  System.out.println("Hi "+n+" "+s);
		  byte h=-45;
		  System.out.println(h);
		  int y=2;
		  // y=~y;
		  System.out.println(~y);
		  String l=(2==2)?"ello":"jkgj";
		  System.out.println(l);
		  System.out.println(l instanceof String);
          char operator;
          operator=scan.next().charAt(0);
          System.out.println(operator);
          switch(operator)
          {
          	   case '-':
          	        System.out.println("ghgh");
          	        break;
          	   case '+':
          	       System.out.println("+ng");
          	       break;
          	   default:
          	       System.out.println("default");
          }

          int []a=new int[6];
          a[0]=3;
          a[1]=5;
          a[2]=7;
          a[3]=6;
          a[4]=8;
          a[5]=9;
          for(int gg:a)
          System.out.println(gg);
          String str="fbfbfFFfb";
          String [] s1=str.split("");
          for(String ss:s1)
          System.out.println(ss);
          System.out.println(str.toUpperCase());
          System.out.println(str.toLowerCase());
          System.out.println(str.substring(0,str.length()));
          System.out.println(str.replace('f','u'));
          System.out.println(str);





	}
}