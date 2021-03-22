import java.util.*;
class collection5
{
	public static void main(String args[])
	{
		LinkedList l1=new LinkedList();
		l1.add("vaibhav");
		l1.add("kumar");
		l1.addFirst("kk");
		l1.addLast("vk");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		//Iterator in forward direction
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Iterartor in backward direction
		ListIterator itrs=l1.listIterator(l1.size());
		while(itrs.hasPrevious())
		{
			System.out.println(itrs.previous());
		}
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.get(0));
		System.out.println(l1.indexOf("vaibhav"));


	}
}