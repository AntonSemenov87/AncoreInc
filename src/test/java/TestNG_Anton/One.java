package TestNG_Anton;

import java.util.Random;

public class One {
    public static void main(String[] args) {
        One one = new One();

        one.reverse("Anton Semenov");

        System.out.println(one.randomNum(300));

    }

    public  void reverse (String word) {
        StringBuilder reverseBuild = new StringBuilder(word);
        String reverse = reverseBuild.reverse().toString();
        System.out.println(reverse);
    }

    public int randomNum (int maxNumber) {
        Random random = new Random();

        return random.nextInt(maxNumber);
    }
}
