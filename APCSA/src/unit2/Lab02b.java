package unit2;

public class Lab02b
{
	public static void main( String[] args )
	{
		Sum test = new Sum();
		test.setNums(5,5);
		test.sum();
		test.print();

		test.setNums(90,100.0);
		test.sum();
		test.print();

		//add more test cases
		test.setNums(100, 300);
		test.sum();
		test.print();
	}
}
