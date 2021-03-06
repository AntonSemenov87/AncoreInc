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


        // Task 4
        // quantity of letters in each word and total
        String opt = "This is Anton Semenov";
        String [] words = opt.split(" ");
        int size = 0;
        int total = 0;
        for (String one : words) {
            size = one.length();
            System.out.println("Size of word " + one + " is " + size);
            total += size;
        }
        System.out.println("Total characters: " + total);

        // Task 4
        // find out all repeated letters
        String name = "A-ba-ba-ha-la-ma-ha";
        String [] array = name.split("");
        String resulto = "";
        for (int i = 0; i < array.length; i++) {
            if (resulto.contains(array[i])) {
                resulto += array[i];
            }
        }
        System.out.println(resulto);
    }
}
