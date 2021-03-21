import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Collection1{


 public static void main(String[] args)
 {
     
      ArrayList<Integer>list1=new ArrayList<>();
      ArrayList<Integer>list3=new ArrayList<>();
      ArrayList list2=new ArrayList();
      list1.add(10);
      list1.add(11);
      list1.add(12);
      list1.add(13);
      list1.add(16);


      list2.add(10);
      list2.add("hi how are you");
      list2.add('A');

      // print the element
      System.out.println(list2);

      // get the element
      Object o=list2.get(1);
      System.out.println(o);

      // set the element

      list2.set(0,"kjk");
      System.out.println(list2);

      // remove the element

      list2.remove(2);
      System.out.println(list2);

      // for remove all element from list

      list1.clear();
      System.out.println(list1);

      // random position add
      list2.add(2,"satya");
      System.out.println(list2);

      // search value in list

      if(list2.contains("satya"))
        System.out.println("satya is present");


      // Iterate in Arraylist
      list1.add(10);
      list1.add(-1);
      for(Integer i:list1)
        System.out.println(i);

      for(int i=0;i<list2.size();i++)
        System.out.println(list2.get(i));

      Iterator<Integer>itr=list1.iterator();
      while(itr.hasNext())
      {
        System.out.println(itr.next());
        itr.remove();
      }
      System.out.println("After iteration arraylist is "+list1);
      
      // addAll method

       list1.add(10);
       list1.add(11);
       System.out.println("list1 is "+list1);
       list3.add(12);
       list3.add(13);
       System.out.println("list3 is "+list3);
       list1.addAll(list3);
       System.out.println("After addAll list1 is "+list1);
      
       // foreach
       list1.forEach(n->System.out.println(n));

       System.out.println("index of 12 in list1 is "+list1.indexOf(12));





 }
}
