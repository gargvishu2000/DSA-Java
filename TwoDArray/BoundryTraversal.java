import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoundryTraversal {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();

        // Top row
        for(int j=0;j<m;j++)
            sb.append(arr[0][j]).append(" ");

        // Right column
        for(int i=1;i<n;i++)
            sb.append(arr[i][m-1]).append(" ");

        // Bottom row
        if(n>1){
            for(int j=m-2;j>=0;j--)
                sb.append(arr[n-1][j]).append(" ");
        }

        // Left column
        if(m>1){
            for(int i=n-2;i>=1;i--)
                sb.append(arr[i][0]).append(" ");
        }

        System.out.println(sb);
    }
}