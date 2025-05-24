import java.util.*;
import java.io.*;

class Baekjoon30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        br.close();

        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());
        int totalT = 0;

        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            if (arr[i] % T != 0) {
                totalT += (arr[i] / T) + 1;
            } else {
                totalT += (arr[i] / T);
            }
        }

        bw.write(totalT + "\n");
        bw.write((N / P) + " " + (N % P));

        bw.flush();
        bw.close();
    }
}