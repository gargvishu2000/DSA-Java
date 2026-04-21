import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int swap=0;
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                    swap++;
                }
            }
            print(arr,i,swap);
            if(flag==false){
                return;
            }
        }
    }
    public static void print(int[] arr,int pass,int swap){
        System.out.print("Pass "+(pass+1)+": ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(", swaps = "+swap);
        System.out.println();
    }
}
