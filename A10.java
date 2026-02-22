import java.util.Scanner;
class A10
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int res = 0;
		float avg = 0.0f;
		int arr[] = new int[5];
		System.out.print("Enter 5 Integer: ");
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
			res = res+arr[i];			
		}
		avg = res/5;
		System.out.println("The average of all elements of the array is: "+avg);


	}

}


