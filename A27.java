class A27
{
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";


        if (str1 == str2) {
            System.out.println("Both variables point to the SAME object: true");
        } else {
            System.out.println("Both variables point to the SAME object: false");
        }
    }



























/*
    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = new String("hello");


        System.out.println("Using == : " + (s1 == s2));

        System.out.println("Using .equals() : " + s1.equals(s2));
    }

*/
























/*
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "world";

        String str3 = str1 + str2;    

        System.out.println("Is str3 pointing to the same object as str1? " + (str3 == str1));

    }

*/
































/*
    public static void main(String[] args) {

        String str1 = new String("hello");  
        String str2 = str1.intern();          
        String str3 = "hello";              
	
        System.out.println("Is str2 and str3 pointing to the same object? " + (s2 == s3));
    }

*/































/*
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "java";
        String str3 = "java";


	if(s1 == s2 && s2 == s3 && s1 == s3)
        	System.out.println("All strings point to the same object: true");
	else
        	System.out.println("All strings point to the same object: false");
    }

*/






}