import java.util.*;

class Baekjoon2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int sum = 1;

        for (int i = 0; i < n; i++) {
            sum += 6 * i;
            if (n <= sum) {
                result = i + 1;
                break;
            }
        }

        System.out.println(result);
    }
}