
import java.util.*;

class collection1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements for first list");
		int n=sc.nextInt();

		ArrayList <Integer>l1=new ArrayList<>(20);
		ArrayList<Integer>l2=new ArrayList<>(20);
		for(int i=0;i<n;i++)
		{
			l1.add(sc.nextInt());
			System.out.println();
		}
		System.out.println("Enter the number of elements for second list");
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			l2.add(sc.nextInt());
			System.out.println();
		}
		




		for(int i:l1)
		{
			System.out.print(i+",");

		}
		
		for(int i:l2)
		{
			System.out.print(i+",");

		}
		System.out.println();
		l1.addAll(l2);
		//l1.clear();
		System.out.println("Enter the element for which you want index");
		int ele=sc.nextInt();
		System.out.println(l1.contains(ele));
		System.out.println(l1.indexOf(ele));
		System.out.println("Enter the position to delete the element");
		int pos=sc.nextInt();
		System.out.println(l1.remove(pos));
		//l1.remove(0);
	}
}