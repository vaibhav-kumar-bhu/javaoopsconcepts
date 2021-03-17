class Circle
{
	private double radius;

	public void setradius (double radius)
	{
		this.radius=radius;
	}
	public double getradius()
	{
		return radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}
}
class Cylinder extends Circle
{
	double height;
	Cylinder (double height)
	{
		this.height=height;
	}
     public double area(double  r)
     {

     	return 2*3.14*r*height; 
     }


}
class practice2
{
	public static void main(String args[])
	{
		Cylinder c1=new Cylinder(10.00);
		c1.setradius(20);
		double r1=c1.getradius();
		System.out.println(c1.area(r1));
		Circle c2=new Circle();
		c2.setradius(100);
		System.out.println(c2.area());
	}
}