import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Collection3{


 public static void main(String[] args)
 {
     
     HashSet<Integer>hash=new HashSet<>();

     System.out.println(".......HashSet........");
     System.out.println();
     hash.add(8);
     hash.add(10);
     hash.add(6);
     hash.add(8);
     hash.add(81);
     hash.add(10);
     hash.add(61);
     hash.add(80);
     // Data is unique no Redundancy.
     // Data is unordered in output due to hashing.
     System.out.println(hash);
     hash.remove(61);
     System.out.println(hash);

     // Treeset
     System.out.println();
     System.out.println(".......TreeSet........");
     System.out.println();
     TreeSet<Integer>hash1=new TreeSet<>();
     hash1.add(8);
     hash1.add(10);
     hash1.add(6);
     hash1.add(8);
     hash1.add(81);
     hash1.add(10);
     hash1.add(61);
     hash1.add(80);
     // Data is unique no Redundancy.
     // Data is unordered in output due to hashing.
     System.out.println(hash1);
     hash1.remove(61);
     System.out.println(hash1);

     TreeSet<Integer>tree=new TreeSet<>(Arrays.asList(2,1,5,6,6,7,8));
 }
}
