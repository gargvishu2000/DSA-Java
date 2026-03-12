import java.util.Scanner;

public class sort01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        while (x > 0) {
            int n = scn.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    c++;
                }
            }
            for(int i=0;i<c;i++){
                System.out.print("0 ");
            }
            for(int i=0;i<n-c;i++){
                System.out.print("1 ");
            }
            System.out.println();
            x--;
        }

    }
}
