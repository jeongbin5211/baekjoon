import java.io.*;
import java.util.*;

class Baekjoon2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            char[] str = st.nextToken().toCharArray();

            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < R; k++) {
                    bw.write(str[j]);
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}