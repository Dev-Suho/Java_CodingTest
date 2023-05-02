import java.util.Scanner;

public class StringV3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result[] = str.split(" ");
        int validation = 0;
        String answer = "";

        for (String x : result) {
            if (x.length() > validation) {
                answer = x;
                validation = x.length();
            }
        }
        System.out.println(answer);
    }
}
