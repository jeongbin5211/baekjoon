import java.util.*;
import java.io.*;

class Baekjoon2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        br.close();

        String result = Integer.toString(A * B * C);


        int[] arr = new int[10];

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            arr[ch - '0'] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}