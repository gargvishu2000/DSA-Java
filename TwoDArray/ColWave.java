import java.io.*;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColWave {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int j=0;j<m;j++){
            if(j % 2 == 0){
                for(int i = 0; i < n; i++){
                    sb.append(arr[i][j]).append(" ");
                }
            } else {
                for(int i = n - 1; i >= 0; i--){
                    sb.append(arr[i][j]).append(" ");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
