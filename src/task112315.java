import java.util.Scanner;
public class task112315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 1;
        for (int i = 0; i < n-1; i++) {
            int trades = -1;
            int temp;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    trades++;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (trades == -1) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
