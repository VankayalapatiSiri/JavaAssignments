public class Question6 {
    public static void main(String args[]) {
        String s =args[0];
        String rev = " ";

        System.out.println("Enter the string: " + s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        int length = s.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + s.charAt(i);

        if (s.equals(rev))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");

    }

}

