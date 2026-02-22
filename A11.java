import java.util.Scanner;
class A11
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int p=0,n=0;
		int arr[] = new int[6];
		System.out.print("Enter 6 Integer: ");
		for(int i=0; i<6; i++)
		{
			arr[i] = sc.nextInt();	
			if(arr[i]<0)
			{
				n=n+1;
			}
			else
			{
				p=p+1;
			}
		
		}
		System.out.println("Positive Numbers: "+p);
		System.out.println("Negetive Numbers: "+n);

	}

}


