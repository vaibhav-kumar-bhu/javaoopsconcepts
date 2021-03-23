
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



    
public class Collection5
{
 public static void main(String[] args)
 {
     
    
   Map<Integer, List<Integer>>mp=new HashMap<>();
   mp.put(1,Arrays.asList(1,2,3,5,7));
   System.out.println(mp.get(1).get(3));

   mp.get(1).add(7);
   System.out.println(mp.get(1).get(4));
     
 }
}
