import java.util.Scanner;

public class ArrangeNuber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            int i = 0, j = n - 1, c = 1;
            while (i <= j) {
                arr[i] = c;
                c += 1;
                if (i != j)
                    arr[j] = c;
                c += 1;
                i++;
                j--;
            }
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
            t--;
        }

    }
}
