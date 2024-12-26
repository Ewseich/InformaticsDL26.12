import java.util.Scanner;
public class task39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int foot = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
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
        int foot1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == foot) {
                res++;
                foot1 = foot;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        arr[j] = -1;
                    }
                }
                break;
            }
        }
        if (foot1 != foot) {
            for (int i = 0; i < n; i++) {
                if (arr[i] > foot) {
                    res++;
                    foot1 = arr[i];
                    for (int j = 0; j < n; j++) {
                        if (arr[j] == arr[i]) {
                            arr[j] = -1;
                        }
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (foot1 == 0) break;
            if (arr[i] - foot1 >= 3) {
                res++;
                foot1 = arr[i];
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        arr[j] = -1;
                    }
                }
            }
        }
        if (foot1 == 0) {
            System.out.println(0);
        }
        else System.out.println(res);
    }
}