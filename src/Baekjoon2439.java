import java.util.*;
import java.io.*;

class Baekjoon2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        // ㅇㅇㅇㅇ

        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= T-i; j++) {
                bw.write(" ");
            }
            for (int k = 1; k <= i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}