package Stuff;

public class PrintStringInReverse {
    public static void main(String[] args) {
        //polindrome
        String original = "CIVIC";

        String result = "";
        for (int i = original.length()-1; i >= 0 ; i--) {
            result += original.charAt(i);
        }
        System.out.println(result);

        if (original.equals(result)) {
            System.out.println("Polindrome!");;
        } else {
            System.out.println("Not a polindrome");
        }
    }
}
