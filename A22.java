class A22

{

	public static void main(String args[])
	{
		
		for(int i=1; i<=11; i++)
		{
			for(int j=0; j<=6; j++)
			{
				if(i==1 || i==11)
					System.out.print("*");
				else if(i%2!=0)
					if(j==0 || j==6)
						System.out.print("*");
					else
						System.out.print(" ");			
			}System.out.println(" ");
		}


	}

}


