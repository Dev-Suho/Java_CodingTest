import java.util.Scanner;

public class StringV6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str= str.toUpperCase();
        String answer = "YES";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) answer="NO";
        }

        System.out.println(answer);
    }
}
