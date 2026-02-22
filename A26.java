import java.util.Scanner;

class A26
{
    public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String str = sc.next();

        	
        	String reversed = "";

        	for (int i = str.length() - 1; i >= 0; i--) {
            		reversed = reversed + str.charAt(i);
        	}

        	if (str.equals(reversed)) {
            		System.out.println("The String '"+str+"' is a Palindrome");
       		} else {
           		System.out.println("The String '"+str+"' is not a Palindrome");
       		}

        	sc.close();
    	}
}