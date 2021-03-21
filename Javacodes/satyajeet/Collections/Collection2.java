import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Collection2{


 public static void main(String[] args)
 {
     
    Queue<Integer>list1=new LinkedList<>();
    Queue list2=new LinkedList();
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
      Object o=list2.poll();
      System.out.println(o);
      System.out.println(list2);
      list1.add(10);
      list1.add(11);
      list1.add(12);
      list1.add(13);
      list1.add(16);

      // print the element
      System.out.println(list1);

      PriorityQueue<Integer>pq=new PriorityQueue<>();
      for(int i=10;i>0;i--)
      {
        pq.add(i);     //add element in queue
        pq.offer(i);  //add element in queue
      }
      for(int i=0;i<10;i++)
      System.out.println("Queue "+pq.poll());

 }
}
