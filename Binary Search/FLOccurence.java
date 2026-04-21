import java.util.Scanner;

public class FLOccurence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int q=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<q;i++){
            int x=scn.nextInt();
            int second=0;
            int first=occurence(arr, x,true);
            if(first!=-1)
            second=occurence(arr, x, false);
            if(first!=-1 && second!=-1)
            System.out.print(first+" "+second);
            else
            System.out.print("-1");
            System.out.println();
        }
    }

    public static int occurence(int[] arr, int x, boolean ch) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                ans = mid + 1;
                if (ch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
