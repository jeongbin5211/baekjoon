import java.util.*;
import java.io.*;

class Baekjoon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int score = 0;
            int add = 0;
            String str = br.readLine();
            char[] arr = str.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 'O') {
                    add += 1;
                    score += add;
                } else {
                    add = 0;
                }
            }
            bw.write(score + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}