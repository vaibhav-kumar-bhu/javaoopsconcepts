import java.lang.*;
import java.io.*;
import java.util.*;

class Car{
	  int speed;
	  String color;

	  void run(String color,int speed)
	  {
	  	    this.speed=speed;
	  	    this.color=color;
	  }
	  void print()
	  {
	  	     System.out.println("car1 color= "+color);
               System.out.println("car1 speed= "+speed); 
	  }
}

class Car1 extends Car
{
	   int height;

	   void run(int height,String color,int speed)
	   {
               super.run(color,speed);
               this.height=height;
              
	   }

	   void print()
	   {
	   	       super.print();
               System.out.println("car1 height= "+height);
	   }
}

public class Common{
	public static void main(String [] args)
	{
          Car1 obj=new Car1();
          obj.run(30,"white",60);
          obj.print();
	}
}