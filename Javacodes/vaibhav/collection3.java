import java.util.*;
class collection3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		Queue<Integer>q=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
            q.add(sc.nextInt());
		}
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.size());

	}
}