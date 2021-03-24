import java.util.Collections;
class l1
{
	public  void display()
	{
		System.out.println("Hello world");
	}
}

class l2 extends l1
{
	public  void disp()
	{
		super.display();
	}

}
class superkey 
{
	public static void main(String args[])
	{
		l2 l=new l2();
		l.disp();


	}
}