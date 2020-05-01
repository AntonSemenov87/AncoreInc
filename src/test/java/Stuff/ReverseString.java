package Stuff;

public class ReverseString {
    public static void main(String[] args) {

        // Task 1
        String str = "Java is the best language";

        String [] arr = str.split(" ");

        String reversed = "";

        for (String word : arr) {
            StringBuilder word1 = new StringBuilder(word);
            word1 = word1.reverse();
            reversed += word1 + " ";
        }
        System.out.println(reversed);





        // Task 2
        // print out repeating characters
        String word = "6560 W Diversey ave";
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(word.charAt(i)+"")) {
                result += word.charAt(i);
            }
        }
        System.out.println(result);



        // Task 3
        // Reverse String and Strings
        String str1 = "Anton Semenov";
        StringBuilder str2 = new StringBuilder(str1);
        String str3 = str2.reverse().toString();
        System.out.println(str2);
        String [] arr2 = str1.split(" ");
        String finito = "";
        for (String word1: arr2) {
            StringBuilder sb = new StringBuilder(word1);
            sb.reverse();
            finito += sb;
        }
        System.out.println(finito);
    }
}
