import java.util.Scanner;
class A3
{

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

}