class A15
{

	public static void main(String args[])
	{
		int k=0;
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i+k; j++)
			{
				if(j%2==0){
				System.out.print(i);
				}
				else{
				System.out.print(" * ");
				}
			}System.out.println(" ");
			k=k+1;
		}
		
		k=3;
		for(int i=4;i>=2; i--)
		{
			for(int j=i+k; j>=1; j--)
			{
				if(j%2!=0){
				System.out.print(i);
				}
				else{
				System.out.print(" * ");
				}
			}System.out.println(" ");
			k=k-1;
		}


	}










/*
	public static void main(String args[])
	{
		int k=0,l=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i+k; j++)
			{
				if(j%2!=0){
				System.out.print(l);
				l++;
				}
				else{
				System.out.print(" * ");
				}
			}System.out.println(" ");
			k=k+1;
			l=1;
		}
		


	}

*/




/*
	public static void main(String args[])
	{
		int k=0,l=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i+k; j++)
			{
				if(j%2!=0){
				System.out.print(l);
				l=l+2;
				}
				else{
				System.out.print(" * ");
				}
			}System.out.println(" ");
			k=k+1;
			l=1;
		}
		


	}

*/





/*
	public static void main(String args[])
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<=5; j++)
			{
				System.out.print(i);
			
			}System.out.println(" ");
		}


	}

*/






/*
	public static void main(String args[])
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(i);
			
			}System.out.println(" ");
		}



	}

*/




/*
	public static void main(String args[])
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(j);
			
			}System.out.println(" ");
		}

	}

*/



/*
	public static void main(String args[])
	{
		int k=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(k+" ");
				k++;
			
			}System.out.println(" ");
		}

	}

*/



/*
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

*/




/*
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

*/




}


