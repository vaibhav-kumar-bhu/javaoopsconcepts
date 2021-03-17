class construct
{
	construct()
	{
		System.out.println("Constructor without parameter invoked");
	}
	construct(String name)
	{
		System.out.println("Constructor with parameter invoked");
	}

}
class constructor{
	public static void main(String args[])
	{
		System.out.println("Main method invoked");
		// construct c1=new construct();
		construct c2=new construct("vaibhav");
	}
}