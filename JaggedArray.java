class JaggedArray
{
	public static void main(String args[])
	{
		//int a[] = {1, 2, 3},  b[] = { 3, 4, 5},c[]=  {1, 4, 5};
		int d[][] = {{1, 2, 3}, { 3, 4}, {1, 4, 5, 8}};

		for(int i = 0; i<d.length; i++)
		{
			for(int j = 0; j<d[i].length; j++)
			{
				System.out.print(" "+d[i][j]);
			}
		System.out.println();
		}

		// enhanced for loop
		for(int k[] : d)
		{
			for(int l : k)
			{
				System.out.print(" "+l);
			}
		System.out.println();
		}
	}
}