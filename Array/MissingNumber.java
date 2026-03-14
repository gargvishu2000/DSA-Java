import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int flag=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i!=j){
                        if(arr[i]==arr[j]){
                            flag=1;
                        }
                    }
                }
                if(flag==0){
                    System.out.println(arr[i]);
                }
                flag=0;
            }
            t--;
        }
    }
}
