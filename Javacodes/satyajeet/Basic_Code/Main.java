import java.io.*;
import java.util.*;
import java.lang.*;

 class Accessmodifiers{
 	// public methods access anywhere
	public void method()
	{
		 System.out.println("Access");
	}
    
    // private methods access only in same class 
    private void method1()
	{
		 System.out.println("Access");
	}
    
    // protected methods access package and it's subclass.
    protected void method2()
	{
		 System.out.println("Access");
	}

}
public class Main {
    
     
    public static void main(String args[]) {
         
         Accessmodifiers obj=new Accessmodifiers();
         obj.method();
         obj.method2();
    }
}