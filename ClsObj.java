class Calculator
{
	int num1=1, num2, result;
	
	public int add()
	{
		return  num1 + num2;
	}
}





public class ClsObj
{

	public static void main(String args[])
		{
			Calculator cal = new Calculator();
			//cal.num1 = 111;
			cal.num2 = 222;
			//cal.add();
			System.out.println("result of adding "+cal.num1+" and "+cal.num2+" is "+ cal.add());
		}
}