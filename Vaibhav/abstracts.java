abstract class superclass
{
	int x=90;
	public static void displaymsg()
	{
		System.out.println("Hello worlds");
	}
	abstract void yourmsg();


}

class subclass extends superclass
{
	public void yourmsg()
	{
		System.out.println("welcome to the subclass " +x);
	}

}



class abstracts
{
	public static void main(String args[])
	{
		subclass c1=new subclass();
		c1.displaymsg();
		c1.yourmsg();

	}
}