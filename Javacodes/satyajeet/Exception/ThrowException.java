
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class ThrowException{

	public static void findFile() throws IOException {

    // code that may generate IOException
     File myObj = new File("test.txt");
      Scanner myReader = new Scanner(myObj);
        // System.out.println(myReader);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
  }
}

  public static void divideByZero() {

    // throw an exception
    throw new ArithmeticException("Trying to divide by 0");
        // throw new Exception("/Trying to divide by 0");

  }

    

 public static void main(String[] args)
 {
     
     try{
    divideByZero();
    }
    catch(Exception e){
       System.out.println(e);
    }
    try{
    findFile();
    }
    catch(Exception e)
    {
    	 System.out.println(e);
    }


     
 }
}
