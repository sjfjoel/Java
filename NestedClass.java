class Outer
{
	void display()
	{
		System.out.println("Outer Class function is executed");
	}

	class Inner  // if declared as static class
	{
		void display()
		{
			System.out.println("Inner class function is executed");
		}
	}
}

class NestedClass
{
	public static void main(String args[])
	{
		Outer outObj = new Outer();
		outObj.display();
		Outer.Inner inObj = outObj.new Inner(); // static class - Outer.Inner inObj = new Outer.Inner(); 
		inObj.display();
	}
}