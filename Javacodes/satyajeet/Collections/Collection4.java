import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Collection4{


 public static void main(String[] args)
 {
     
     Map<String,Integer>mp=new HashMap<>();

     System.out.println(".......HashMap........");
     System.out.println();
     mp.put("satya", 1);
     mp.put("indra",2);
     System.out.println("HashMap: "+mp);
     System.out.println(mp.get("satya"));
     System.out.println("keys: "+mp.keySet());
     System.out.println("value: "+mp.values());
     mp.replace("indra",3);
     System.out.println("After change: "+mp);
     Map<String,Integer>mp1=new HashMap<>(mp);
     mp1.compute("satya",(keys,value)->++value);
     System.out.println("mp1: "+mp1);



     
 }
}
