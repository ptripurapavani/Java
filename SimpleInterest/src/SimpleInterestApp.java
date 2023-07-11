import java.util.Scanner;

public class SimpleInterestApp {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			double principle=scan.nextDouble();
			double rate=scan.nextDouble();
			double time=scan.nextDouble();
			
			SimpleInterest calculator = new SimpleInterest();
			System.out.println(calculator.calculateSimpleInterest(1000.0, 0.05, 2.0));

}
}
