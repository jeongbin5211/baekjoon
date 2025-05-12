import java.util.*;
import java.io.*;

class Baekjoon10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int A;
        int B;

        while (true) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            bw.write(A + B + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}