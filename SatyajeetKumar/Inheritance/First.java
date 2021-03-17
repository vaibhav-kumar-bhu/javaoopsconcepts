class Parent
{
	void Method()
	{
     System.out.println("parent");
	}
}


class Child extends Parent
{
     void Method()
	{
     System.out.println("child");
      super.Method();
	}
}
public class First {
    public static void main(String args[]) {
         
            Child obj= new Child();
            obj.Method();
            
        }
    }
