import java.util.Scanner;

public class checkArray{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}