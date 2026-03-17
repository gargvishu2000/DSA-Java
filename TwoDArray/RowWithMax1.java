import java.util.Scanner;

public class RowWithMax1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int minRow=-1,cmax=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1) c++;
            }
            if(c>cmax){
                minRow=i;
                cmax=c;
            }
        }
        System.out.println(minRow);
    }
}
