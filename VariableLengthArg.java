class Calculator
{
	public int add(int ... numbers)
	{
		int sum = 0;
		for(int i : numbers)
		{
			sum = sum+i;
		}
		return sum;	
	}
	public int sub(int ... numbers)
	{
		int sum = 0;
		for(int i : numbers)
		{
			sum = i-sum ;
		}
		return sum;
	}
}

class VariableLengthArg
{
	public static void main(String args[])
	{
		Calculator cal = new Calculator();
		System.out.println( cal.add(1,2,3,4,5,6,7,8,9));
		System.out.println( cal.sub(1,2,3,4,5,6,7,8,9));
		
	}
}