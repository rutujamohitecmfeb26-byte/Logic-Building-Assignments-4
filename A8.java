import java.util.Scanner;
class A8
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);


		String arr[] = new String[4];
		System.out.print("Enter 4 Names: ");
		for(int i=0; i<4; i++)
		{
			arr[i] = sc.nextLine();
		}

		System.out.println();
		for(int i=0; i<4; i++)
		{
			System.out.println(arr[i]);			
		}
		System.out.println();

	}

}


