import java.lang.*;
import java.util.*;
import java.io.*;
class LinkedList1 {

  // create an object of Node class
  // represent the head of the linked list
  Node head;

  // static inner class
  static class Node {
    int value;

    // connect each node to next node
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

public static void main(String [] args)
{
	 
    LinkedList1 d=new LinkedList1();
    d.head=new Node(1);
    Node y=new Node(2);
    d.head.next=y;
    while(d.head!=null)
    {
        System.out.println(d.head.value);
        d.head=d.head.next;
    }

	  // String s1="javahhhfdf";
	  String s2="java";

	  // String s=s1.concat(s2);
	   // String s=s1+s2;
      // String s=s1.substring(1,4);
      char [] ss=s2.toCharArray();
       Arrays.sort(ss);
	  System.out.println(ss);
	  String d1=String.valueOf(ss);
	  	  System.out.println(d1);

	  // Array List in java
	  ArrayList<String>v=new ArrayList<>();
	  v.add("iliu");
	  v.add("kjljli");
	  // v.addAll("jkhkk","iliulu");
	  v.set(0,"satya");
	  	  System.out.println(v.get(0));

     Stack<Integer>st=new Stack<>();
     st.push(9);
     st.push(8);
     	  System.out.println(st.peek());

     	  System.out.println(st.search(8));

        String [] a={"dog","gdo","odg","hqw","ast","sat","iliu"};
	    ArrayList<String>v1=new ArrayList<>();
       HashMap<String,ArrayList<String>>mp=new HashMap<>();
       for(int i=0;i<a.length;i++)
       {
       	  String s1=a[i];
       	  char [] ch=s1.toCharArray();
       	  Arrays.sort(ch);
       	  String s=String.valueOf(ch);
       	   if(mp.get(s)==null)
       	   {
       	   	 v1.add(s);
       	   	 mp.put(s,new ArrayList<String>());
              mp.get(s).add(a[i]);
       	   }
       	   else
       	   {
       	   	  mp.get(s).add(a[i]);
       	   }
       }    
     
      	  for(int j=0;j<v1.size();j++)
      	  {
      	  	
      	  	 	  for(int i=0;i<mp.get(v1.get(j)).size();i++)
      	  	 	  {
                     System.out.print(mp.get(v1.get(j)).get(i)+" ");
                  }
             
      	           System.out.println();
         }
         // priorityQueue

      PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
      // PriorityQueue<Integer>pq=new PriorityQueue<Integer>((a,b)->b-a);
      // Queue<Integer>pq=new ArrayDeque<Integer>();
      // Deque<Integer>pq=new ArrayDeque<Integer>();
      // PriorityQueue<Integer>pq=new PriorityQueue<Integer>();

      pq.add(16);
      pq.add(6);
      pq.add(88);
      // y=Math.max(c,y);
      System.out.println(pq.poll());
     
   //   int number = Scan.nextInt();
   //       char c=(char)97;
   //      System.out.println(c);
	  // String [] d={"fdf","mgg","jkhk","jkhjhkj"};
	  // ArrayList<String>v=new ArrayList<>(Arrays.asList(d));
	  // System.out.println(v);
	  // char [] a=d[0].toCharArray();
	  // 	  System.out.println(a);
   //     char []vv={'o','i','k'};
   //     	  	  System.out.println(vv);



}


}