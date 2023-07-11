package Temperature;
import java.util.*;
public class TemperatureApp {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	double f=scan.nextDouble();
	Temperature temperatureConverter = new Temperature();

	System.out.printf("%.2f" ,temperatureConverter.convertFahrenheitToCelsius(f ));
	 
	}
}
