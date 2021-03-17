interface bicycle
{
	void applybreak();
	void applygear();
}
abstract class superclass1
{
	void msg()
	{
		System.out.println("Hello world");
	}
	abstract void yourmsg();
}

class subclass extends superclass1 implements bicycle
{
	public void applybreak()
	{
		System.out.println("Break applied");
	}
	public void applygear()
	{
		System.out.println("Gear applied");
		
	}
	void yourmsg()
	{
		System.out.println("WElcome to the subclass this subclass implements interface and abstracts class also");
	}

}
class inter{
	public static void main(String args[])
	{
		subclass s1 =new subclass();
		s1.msg();
		s1.applybreak();
		s1.yourmsg();
	}
} 