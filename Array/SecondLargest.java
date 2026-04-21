import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max1=0,max2=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2 && arr[i]<max1){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
