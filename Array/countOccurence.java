import java.util.Scanner;

public class countOccurence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int x=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
}
