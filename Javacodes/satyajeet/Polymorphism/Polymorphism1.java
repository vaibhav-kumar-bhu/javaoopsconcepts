import java.lang.*;
import java.io.*;
import java.util.*;


class  Superclass{ 
  
    void print() 
    { 
        System.out.println("superclass"); 
    } 
} 
  
class Subclass extends Superclass { 
  
    void print() 
    { 
        System.out.println("subclass"); 
    } 
} 
  
public class Polymorphism1 { 
    public static void main(String[] args) 
    { 
  
        
        Superclass obj1=new Superclass();
        obj1.print();
        Superclass obj2=new Subclass();
        obj2.print();
        Subclass obj3 = new Subclass();
        obj3.print();


    }

} 