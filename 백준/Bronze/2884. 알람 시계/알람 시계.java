import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		int totalMinute = H * 60 + M;
		int totalMinuteMinused = totalMinute - 45;
		int Hplused;
		int Mplused;
		if(totalMinuteMinused<0) {
			Hplused = (totalMinuteMinused+1440)/60; 
			Mplused = (totalMinuteMinused+1440) - (Hplused*60);
			System.out.println(Hplused + " " + Mplused);
		} else if (totalMinuteMinused>1440) {
			Hplused = (totalMinuteMinused-1440)/60;
			Mplused = totalMinuteMinused - (Hplused*60);
			System.out.println(Hplused + " " + Mplused);
		} else {
			Hplused = totalMinuteMinused/60;
			Mplused = totalMinuteMinused - (Hplused*60);
			System.out.println(Hplused + " " + Mplused);
		}
		scanner.close();
	}
}