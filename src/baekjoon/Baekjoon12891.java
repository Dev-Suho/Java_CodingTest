package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon12891 {
    static int myArr[];
    static int chkArr[];
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length =  Integer.parseInt(st.nextToken());
        int part = Integer.parseInt(st.nextToken());
        int result  = 0;
        chkArr = new int[4];
        myArr = new int[4];
        char[] arr;
        checkSecret = 0;

        arr = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < chkArr.length; i++) {
            chkArr[i] = Integer.parseInt(st.nextToken());
            if(chkArr[i] == 0) {
                checkSecret++;
            }
        }

        for(int i = 0; i < part; i++) {
            addArray(arr[i]);
        }

        if (checkSecret == 4) result++;

        for(int i = part; i < length; i++) {
            int j = i - part;
            addArray(arr[i]);
            removeArr(arr[j]);
            if(checkSecret == 4) result++;
        }
        System.out.println(result);
        br.close();
    }

    private static void addArray(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == chkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == chkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == chkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == chkArr[3]) checkSecret++;
                break;
        }
    }

    private static void removeArr(char c) {
        switch (c) {
            case 'A':
                if(myArr[0] == chkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == chkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == chkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == chkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }


}
