import java.util.*;
import java.io.*;

class Baekjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());

            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }
}