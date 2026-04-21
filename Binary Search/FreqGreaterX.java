import java.util.Arrays;
import java.util.Scanner;

public class FreqGreaterX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int q = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < q; i++) {
            int x = scn.nextInt();
            int k=firstOcc(arr, x);
            System.out.println(arr.length-k);
        }
    }

    public static int firstOcc(int[] arr, int x) {
        int start = 0, end = arr.length - 1, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans==0?start:ans;
    }
}
