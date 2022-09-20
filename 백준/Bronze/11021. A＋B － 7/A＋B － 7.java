import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int[] number = new int[T];
			number[i] = i+1;
			bw.write("Case #" + number[i] + ": " +  (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}
}