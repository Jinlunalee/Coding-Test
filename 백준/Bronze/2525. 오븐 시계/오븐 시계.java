import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentHour = scanner.nextInt();
		int currentMinute = scanner.nextInt();
		int currentTotalMinute = currentHour * 60 + currentMinute;
		int plusedMinute = scanner.nextInt();
		int finalTotalMinute = currentTotalMinute + plusedMinute;
		int finalHour = finalTotalMinute/60;
		int finalMinute = finalTotalMinute -finalHour*60;
		if(finalMinute>59) {
			finalMinute = finalMinute - 60;
		}
		if(finalHour>23) {
			finalHour -= 24;
		}
		System.out.println(finalHour + " " + finalMinute);
		scanner.close();
	}
}