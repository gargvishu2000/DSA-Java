import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE,ind=0;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    ind=j;
                }
            }
            arr[ind]=arr[i];
            arr[i]=min;
            print(arr,min,i);
        }
    }
    public static void print(int[] arr,int min,int pass){
        System.out.print("Pass "+(pass+1)+": ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(", min_selected = "+ min );
        System.out.println();
    }
}
