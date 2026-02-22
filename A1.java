import java.util.Scanner;
class A1
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter a Number: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}









/*
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter a Number: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
	}


*/



/*
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int n;
		int res = 1;
		System.out.print("Enter a Number: ");
		n = sc.nextInt();
		for(int i=n; i>0; i--)
		{
			res = res*i;
		}
		System.out.println("Factorial of "+n+" is "+res);
		
	}

*/




/*
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter a Number: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
	}

*/


/*

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);


		int n;
		int res=0;
		System.out.print("Enter a Number: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
				res=res+i;
			}
			
		}
		System.out.println("The sum of all numbers from 1 to "+n+" is "+res);
		
	}



*/








}