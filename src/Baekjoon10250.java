import java.util.*;
import java.io.*;

class Baekjoon10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int YY;
            int XX;

            if (N % H == 0) {
                YY = H * 100;
                XX = N / H;
            } else {
                YY = (N % H) * 100;
                XX = (N / H) + 1;
            }

            int answer = YY + XX;
            bw.write(String.valueOf(answer));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();

    }
}