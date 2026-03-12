import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int a=0,b=n-1;
        for(int i=0;i<n/2;i++){
            int k=arr[a];
            arr[a]=arr[b];
            arr[b]=k;
            a++;
            b--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
