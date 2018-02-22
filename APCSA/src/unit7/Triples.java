package unit7;

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		num = number;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;

		
		for (int i = a; i > 0; i--)
		{
			if (a%i == 0 && b%i == 0 && c%i == 0)
			{
				i = max;
			}
		}
		

		return 1;
	}
	
	public void writeTriple (int num)
	{
		for (int c = 1; c < num; c++)
		{
			for (int b = 1; b < num; b++)
			{
				for (int a = 1; a < b; a++)
				{
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
					{
						if ( (a%2 == 1 && b%2 == 0)||(a%2 == 0 && b%2 == 1))
						{
							if (greatestCommonFactor(a,b,c) == 1)
							{
								System.out.println(a + " " + b + " " + c + "\n");
							}
						}
					}
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		
		return output;
	}
}