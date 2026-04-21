import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // pass the whole array
        for(int i=0;i<n-1;i++){
            int j=i+1,swap=0;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap++;
                }
                j--;
            }
            System.out.print("Pass "+(i+1)+": ");
            for(int a=0;a<arr.length;a++){
                System.out.print(arr[a]+" ");
            }
            System.out.print(" , ");
            boolean fl=false;
            for(int a=0;a<arr.length;a++){
                System.out.print(arr[a]+" ");
                if(a>i && fl==false){
                    System.out.print("| ");
                    fl=true;
                }
            }
            System.out.println(", shifts = "+swap);
        }
    }
}
