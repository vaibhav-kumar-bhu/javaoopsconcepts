import java.io.*;
import java.util.*;
import java.lang.*;

 class Accessmodifiers{
	protected void method()
	{
		 System.out.println("Access");
	}
}
public class Main extends Accessmodifiers {
    
    
    public static void main(String args[]) {
         
         Accessmodifiers obj=new Accessmodifiers();
         obj.method();
    }
}