package string;

import java.util.Scanner;

public class StringV8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.toUpperCase().replaceAll("[^A-Z]", "");
        String answer = "NO";

        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";

        System.out.println(answer);
    }
}
