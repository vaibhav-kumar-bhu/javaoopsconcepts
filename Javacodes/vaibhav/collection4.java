import java.util.*;

class collection4
{
	public static void main(String args[])
	{
		//Non type safe array list
		ArrayList arr=new ArrayList();
		arr.add("vaibhav");
		arr.add(10);
		arr.add("kumar");
		System.out.println(arr);
		arr.set(0,"vks");
		System.out.println(arr);
		arr.add(0,"kumar");
		System.out.println(arr);
		Vector v=new Vector();
		v.addAll(arr);
		System.out.println(v);
		System.out.println("The size of the vector is "+v.size());
		System.out.println("The size of the arraylist is "+arr.size());
		v.remove("vks");
		System.out.println(v);
		Stack st = new Stack();
		st.addAll(v);
		System.out.println(st);
		System.out.println(st.pop());
		st.push("vaibhav");
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.size());
		st.add("vksa");
		System.out.println(st.size());
		System.out.println(st);
		//Collections.sort(v);
		System.out.println(v);
		
		//System.out.println(st.clone());
		









	}
}