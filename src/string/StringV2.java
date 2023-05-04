package string;

import java.util.Scanner;

public class StringV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";

        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x) == true) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        System.out.println(answer);
    }

}
