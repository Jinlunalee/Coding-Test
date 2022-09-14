import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int x = 0;
		for(int i=1; i<=n; i++) {
			x = x + i;
		}
		System.out.println(x);
		scanner.close();
	}
}