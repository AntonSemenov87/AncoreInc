package Stuff;

public class ReverseString {
    public static void main(String[] args) {


        String str = "Java is the best language";

        String [] arr = str.split(" ");

        String reversed = "";

        for (String word : arr) {
            StringBuilder word1 = new StringBuilder(word);
            word1 = word1.reverse();
            reversed += word1 + " ";
        }
        System.out.println(reversed);
    }
}
