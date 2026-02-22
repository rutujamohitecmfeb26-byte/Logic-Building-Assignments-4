import java.util.Scanner;
class A9
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int j=0;
		int arr[] = new int[5];
		System.out.print("Enter 5 Integer: ");
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]>j)
			{
				j=arr[i];
			}
						
		}

		System.out.println("The largest element of the array is: "+j);


	}

}


