class sets
{
	private int height;
	private int radius;
	public void setheight(int height)
	{
		this.height=height;


	}
	public void setradius(int radius)
	{
		this.radius=radius;
	}
	public int getheight()
	{
		return height;

	}
	public int getradius()
	{
		return radius;
	}
}
class practice1{
	public static void main(String args[])
	{
		sets s1=new sets();
		s1.setradius(20);
		System.out.println(s1.getradius());
	}
}
