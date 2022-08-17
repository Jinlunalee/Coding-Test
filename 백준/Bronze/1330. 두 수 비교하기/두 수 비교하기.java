import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		if((A>=-10000) && (B<=10000)) {
			if(A>B) {
				System.out.println(">");
			} else if(A<B) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		}
		scanner.close();
	}
}