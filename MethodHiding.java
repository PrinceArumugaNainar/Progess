package Revision;


 class Parent
{
	void show()
	{
		System.out.println("Parent instance method");
	}
	
	static void display()
	{
		System.out.println("the parent static display");
	}
}

class Childs extends Parent
{
	@Override
	void show()
	{
		System.out.println("child instance method");
	}
	
	static void display()
	{
		System.out.println("the parent static display");
	}
}




public class MethodHiding  {

	public static void main(String[] args) {
		
		Parent p= new Childs();
		p.show();
		p.display();

	}

}
