import java.util.*;
import java.io.*;

class Backjoon10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            while (a < b) {
                int temp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = temp;
                a++;
                b--;
            }
        }

        br.close();

        for (int d = 0; d < N; d++) {
            bw.write(arr[d] + " ");
        }

        bw.flush();
        bw.close();
    }
}