class counter{
	 static int count=0;
	counter()
	{
		//System.out.println("you are under the constructor");
		count++;
		System.out.println("the value of count is "+count);

	}
}
class statics

{
	public static void main(String args[])
	{
		//System.out.println("you are under the main method");
		counter c1=new counter();
		counter c2=new counter();
	}
}