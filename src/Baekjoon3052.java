import java.util.*;
import java.io.*;

class Baekjoon3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            s.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(s.size());

    }
}