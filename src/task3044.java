import java.util.Scanner;
public class task3044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[20001];
        for (int i = 0; i < n; i++) {
            count[sc.nextInt() + 10000]++;
        }
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.println(i-10000 + " ");
            }
        }
    }
}
