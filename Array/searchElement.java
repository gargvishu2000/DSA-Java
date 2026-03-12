import java.util.*;

public class searchElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ele = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
                return;
    }
}
