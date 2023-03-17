import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[] arr = new int[N];
        
        for (int x=0; x<N; x++) {
            arr[x] = 0;
        }

        for (int a=0; a<M; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            for (int b=0; b<k; b++) {
                for (int c=i-1 ; c<j; c++) {
                    arr[c] = b+1;
                }
            }
        }
        for (int u=0; u<arr.length; u++) {
            System.out.print(arr[u] + " ");
        }
        scanner.close();
    }
}