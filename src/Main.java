import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];

        for (int j = 0; j < N; j++) {
            if (arr[j] >= max) {
                max = arr[j];
            } else if (arr[j] < min) {
                min = arr[j];
            }
        }
        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }
}