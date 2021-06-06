class Models
{
	int mid;
	String mname;
	double mprice;
	static String brand;
	
	// static block
	static
	{
		brand = "JoCav";
		
	}

	// constructor
	Models()
	{
		mid = 11111;
		mname = "Be anouneced";
		mprice = 90000;
	}
	Models(int id, String name, double price)
	{
		mid = id;
		mname = name;
		mprice = price;
	}

	// member function
	public void show()
	{
		System.out.println("Model ID : "+mid+"\nModel Name : "+mname+"\nModel Price : "+mprice+"\nBrand Name : "+brand);
	}
}

public class StaticBlock
{
	public static void main(String args[])
	{
		Models seden = new Models();
		seden.show();
		System.out.println();
		Models suv = new Models(12345, "FREEKZ", 750000);
		suv.show();
	}
}
