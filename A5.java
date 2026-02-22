import java.util.Scanner;
class A5
{

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

}