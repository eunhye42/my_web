import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int c = Integer.parseInt(br.readLine());
			String[] input = new String[c];
			for (int i = 0; i < c; i++) {
				input[i] = br.readLine();
			}
			//String[] arr = br.readLine().split(" ");
			br.close();
			//char[] c = String.valueOf(a).toCharArray();
			for(int j=0; j<c; j++) {
				String[] test = input[j].split(" ");
				int n = Integer.parseInt(test[0]);
				int[] rate = new int[n];
				float avg = 0;
				for(int k=1; k<test.length; k++) {
					avg += rate[k-1] = Integer.parseInt(test[k]);
				}
				avg/=n;
				float r = 0;
				for(int l=0; l<rate.length; l++) {
					if(avg < rate[l]) {
						r++;
					}
				}
				r= r/rate.length*100;
				bw.write(String.format("%.3f", r)+"%");
				bw.newLine();
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		int[] arr = new int[10000];
		for(int i=1; i<10000; i++) {
		numD(i);
		}
	}
	public static int numD(int n) {
		String str = String.valueOf(n);
		int log = 1, num=n;
		for (int i=1; i<str.length(); i++) {
			log*=10;
		}
		while(log<1){
			num += n/log;
			log/=10;
		}
		
		return num;
	}
}

class Testo {
	long sum() {
		long ans=0;
		for(int i=1; i<10; i++) {
			if(i%2==0)
			System.out.println(i);
		}
		for(int i=9; i<=10000; i++) {
			i+=11;
			System.out.println(i);
		}
		return ans;
	}
}