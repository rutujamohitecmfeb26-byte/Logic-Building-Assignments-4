class A15
{

	public static void main(String args[])
	{
		int k=0;
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i+k; j++)
			{
				if(j%2==0){
				System.out.print(i);
				}
				else{
				System.out.print(" * ");
				}
			}System.out.println(" ");
			k=k+1;
		}
		
		k=3;
		for(int i=4;i>=2; i--)
		{
			for(int j=i+k; j>=1; j--)
			{
				if(j%2!=0){
				System.out.print(i);
				}
				else{
				System.out.print(" * ");
				}
			}System.out.println(" ");
			k=k-1;
		}


	}


}
