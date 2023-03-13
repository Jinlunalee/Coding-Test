import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i=0; i<N; i++) {
            array[i] = scanner.nextInt();
        }
        int v = scanner.nextInt();
        int count = 0;
        for (int k=0; k<array.length; k++) {
            if(v==array[k]) {
                count++;
            }
        }
        System.out.println(count);
    }
}