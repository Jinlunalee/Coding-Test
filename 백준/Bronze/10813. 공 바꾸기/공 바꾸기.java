import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[] arr = new int[N];
        
        for (int x=0; x<N; x++) {
            arr[x] = x+1;
        }

        for (int a=0; a<M; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int dummy = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = dummy;
        }
        for (int u=0; u<arr.length; u++) {
            System.out.print(arr[u] + " ");
        }
        scanner.close();
    }
}