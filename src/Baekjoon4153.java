import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class Baekjoon4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;



        while (true) {

            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());



            if (A == 0 && B == 0 && C == 0) {
                break;
            } else {
                int[] arr = {A, B, C};

                Arrays.sort(arr);

                if ((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2])) {
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }
}