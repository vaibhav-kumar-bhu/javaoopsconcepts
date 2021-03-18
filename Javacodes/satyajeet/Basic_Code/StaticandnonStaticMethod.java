import java.io.*;
import java.util.*;
import java.lang.*;

public class StaticandnonStaticMethod {
    
      // this is static method
      public static void staticmethod()
      {
      	  System.out.println("static method");
      }
     
     //  this is non static method
      public void nonstaticmethod()
      {
      	System.out.println("Non static metod");
      }
    public static void main(String args[]) {
         
         StaticandnonStaticMethod nonstaticObj=new StaticandnonStaticMethod();
         // static method no need to have an object
         staticmethod();
         //  non static method need to have object
         nonstaticObj.nonstaticmethod();
    }
}