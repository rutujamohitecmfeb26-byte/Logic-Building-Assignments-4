import java.util.Scanner;
class A24 
{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
        String str = sc.next();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println(reversed);
    }

























/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
        sc.close();
    }
*/























/*
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

*/
















}