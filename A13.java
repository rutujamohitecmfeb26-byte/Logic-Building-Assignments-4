import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class A13
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		
		int key;
		int count=0;
		int arr[] = new int[5];
		System.out.print("Enter 5 Integer: ");
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
						
		}
		

		System.out.println("Enter the number to search: ");
		key = sc.nextInt();
		for(int i=0; i<5; i++)
		{
			if(key==arr[i])
			{
				System.out.println("Found");
				count++;
				break;
			}

		}
		if(count==0)
			System.out.println("Not found");



	}

}


