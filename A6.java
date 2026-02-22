import java.util.Scanner;
class A6
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.print("Enter 5 Integer: ");
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();			
		}

		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");			
		}
		System.out.println();


	}


















\*

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.print("Enter 5 Integer: ");
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();			
		}

		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");			
		}
		System.out.println();


	}


*/




/*
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

*/



/*
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

*/


/*
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

*/



/*
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

*/





/*
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

*/


/*
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

*/


/*
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

*/


/*
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

*/




}


