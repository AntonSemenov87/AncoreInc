package Stuff;

public class NeVajno {
    public static void main(String[] args) {

        String str = "Payment $100 paid";
        System.out.println(str.charAt(8));

        String str1 = "Payments $100 paid";
        System.out.println(str1.indexOf("$"));

        String part = str.substring(8);
        System.out.println(part);

    }
}
