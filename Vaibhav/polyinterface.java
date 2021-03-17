interface camera
{
	void capture();
	void recordvideo();

}
interface gps
{
	
	void getlocation();
}
abstract class gallery
{
	void showpic()
	{
		System.out.println("showing the pic ...");
	}
	abstract void yourpostcard(); 
}

interface calculator
{
	int sum(int a,int b);
	int multiply(int a,int b);
	int diff(int a,int b);
}
class cellphone extends gallery implements camera,gps
{
	public void capture()
	{
		System.out.println("capturing photo ....");
	}
	public void recordvideo()
	{
		System.out.println("recording video");
	}
	public void getlocation()
	{
		System.out.println("welcome to the India");
	}
	void yourpostcard()
	{
		System.out.println("greetings of the day");
	}

}
class smartphone extends cellphone implements calculator{
	 public int sum(int a,int b)
	{
		return a+b;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public int diff(int a,int b)
	{
		return a-b;
	}
} 

class polyinterface
{
	public static void main(String args[])
	{
		camera c=new smartphone(); // dynamic object dispatch in other words here you can only use camera feature of the smartphone

		c.recordvideo();
		gps s=new smartphone();// you can use only gps feature
		s.getlocation();
	}
}