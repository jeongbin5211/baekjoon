import java.util.*;
import java.io.*;

public class Baekjoon2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0; // 만약 분해합이 없을 때 0 출력

        for (int i = 1; i < n; i++) {
            int sum = i;
            int number = i;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}