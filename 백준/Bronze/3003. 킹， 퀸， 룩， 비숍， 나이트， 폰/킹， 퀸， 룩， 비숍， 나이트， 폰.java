import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int king = 1 - scanner.nextInt();
		int queen = 1 - scanner.nextInt();
		int look = 2 - scanner.nextInt();
		int bishop = 2 - scanner.nextInt();
		int knight = 2 - scanner.nextInt();
		int phone = 8 - scanner.nextInt();
		System.out.printf("%d %d %d %d %d %d", king, queen, look, bishop, knight, phone);
		scanner.close();
	}
}