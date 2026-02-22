class A28{
    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = new String("hello");


        System.out.println("Using == : " + (s1 == s2));

        System.out.println("Using .equals() : " + s1.equals(s2));
    }
}