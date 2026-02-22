import java.util.Scanner;
class A7
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int res = 0;
		int arr[] = new int[5];
		System.out.print("Enter 5 Integer: ");
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
			res = res+arr[i];			
		}

		System.out.println("The sum of all elements of the array is: "+res);


	}

}


