

import java.util.Scanner;

public class Chp1StdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		double sum = 0.0;
		int cnt = 0;
		while(scanner.hasNext()){
			sum += scanner.nextDouble();
			cnt++;
		}
		double avg = sum / cnt;
		System.out.printf("\nsum is %f", sum);
		System.out.printf("\ncnt is %d", cnt);
		System.out.printf("\nAverage is %.5f\n", avg);
	}
}
