import java.util.Scanner;

public class BinarySearchString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.next();
        }

        String str = scn.next();

        int s = 0, e = n - 1;

        while(s <= e){
            int m = s + (e - s) / 2;

            int cmp = arr[m].compareTo(str);

            if(cmp == 0){
                System.out.println("YES");
                return;
            }
            else if(cmp < 0){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }

        System.out.println("NO");
    }
}