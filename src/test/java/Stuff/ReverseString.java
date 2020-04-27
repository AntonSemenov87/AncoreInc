package Stuff;

public class ReverseString {
    public static void main(String[] args) {


        String str = "Java is the best language";

        String [] arr = str.split(" ");

        String reversed = "";
        for (String word : arr) {
            char [] ch = word.toCharArray();
            for (int i = ch.length-1; i >= 0 ; i--) {
                reversed += ch[i] + "";
            }
        }
        System.out.println(reversed);
    }
}
