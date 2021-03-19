import java.lang.*;
import java.io.*;
import java.util.*;

abstract class shape{
	 
	  String color;
    abstract void perimeter();
	   shape(String color)
	  {
          this.color=color;
	  }
	  
}

class Rectangle extends shape
{
	  
      int edge;
      Rectangle(int edge,String color)
      {
           super(color);
           this.edge=edge;

      }
	  void perimeter()
	  {
           System.out.println("perimeter: "+4*edge+ "\n\n" + "Color:    "+color);
	  }
}

public class Abstract{
	public static void main(String [] args)
	{
         Rectangle obj=new Rectangle(6,"green");
         obj.perimeter();
	}
}