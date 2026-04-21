import java.util.Arrays;
import java.util.Scanner;

public class LargestEleLessX {
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int q=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<q;i++){
            int x=scn.nextInt();
            System.out.println(binarySearch(arr, x));
        }
    }
    public static int binarySearch(int[] arr,int x){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==x){
                return arr[mid];
            }else if(arr[mid]>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end==-1?-1:arr[end];
    }
}
