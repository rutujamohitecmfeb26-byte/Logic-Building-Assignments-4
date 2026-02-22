import java.util.Scanner;
class A4
{

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

}