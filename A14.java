import java.util.Scanner;
class A14
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		
		int j,f=0;
		int arr[] = new int[5];
		System.out.print("Enter 5 Integer: ");
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
						
		}

		System.out.println("Enter the number to search: ");
		j = sc.nextInt();
		for(int i=0; i<5; i++)
		{
			if(j==arr[i])
			{
				f=i;
			}
		}




		System.out.println("The index of "+j+" is: "+f);


	}

}


