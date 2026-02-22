import java.util.Scanner;
import java.util.Arrays;
class A12
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int sarr[] = new int[5];
		System.out.print("Enter 5 Integer: ");
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();			
		}


		Arrays.sort(arr);
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");			
		}
		System.out.println();


	}

}


