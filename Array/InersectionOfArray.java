import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InersectionOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int m = scn.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = scn.nextInt();
            }
            boolean[] check=new boolean[Math.max(n, m)];
            Arrays.fill(check, false);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i]==arr2[j] && check[j]==false){
                        System.out.print(arr[i]+" ");
                        check[j]=true;
                        break;
                    }
                }
            }
            System.out.println();
            t--;
        }

    }

}
