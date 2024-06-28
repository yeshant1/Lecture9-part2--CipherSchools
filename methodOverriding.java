package premitiveDt;
class Parent {
	void fun()//Overridden method
	{
		System.out.println("Hi I'm A");
	}
	
}
class Child extends Parent
{
	void fun()//Overriding method
	{
		System.out.println("Hi I'm B");
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.fun();
	}

}
