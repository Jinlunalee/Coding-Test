import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int numa = num2/100;
		int numb = (num2-numa*100)/10;
		int numc = num2-numa*100-numb*10;
		int num3 = num1 * numc;
		int num4 = num1 * numb;
		int num5 = num1 * numa;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num3 + 10 * num4 + 100 * num5);
		scanner.close();
	}
}