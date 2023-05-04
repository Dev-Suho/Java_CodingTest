package string;

import java.util.ArrayList;
import java.util.Scanner;

public class StringV4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str[] = new String[count];

        for(int i = 0; i < count; i++) {
            str[i] = sc.next();
        }
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
            }
        }
    }
}
