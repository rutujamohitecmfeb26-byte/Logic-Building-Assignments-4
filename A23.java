class A23
{

	public static void main(String args[])
	{

		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<10-i; j++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=i;c++)
			{
				System.out.print("*");
			}
			for(int d=1;d<=i-1;d++)
			{
				System.out.print("*");
			}System.out.println();
		}


		for(int i=9; i>=1; i--)
		{
			for(int j=1; j<=9-i; j++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=i;c++)
			{
				System.out.print("*");
			}
			for(int d=1;d<=i-1;d++)
			{
				System.out.print("*");
			}System.out.println();
		}


	}

}


