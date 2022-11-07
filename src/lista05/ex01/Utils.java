package lista05.ex01;

import java.util.Random;

public class Utils {

    public static String generateAccountNumber() {
        char[] chars = "0123456789".toCharArray();

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }

        return sb.toString();
    }
}