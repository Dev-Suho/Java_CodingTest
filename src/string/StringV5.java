package string;

import java.util.Scanner;

public class StringV5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        String answer = String.valueOf(s);

        System.out.println(answer);
    }
}
