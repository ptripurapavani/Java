package Double;
import java.util.*;
public class Double {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter anumber");
	int num=scan.nextInt();
	int result=doubleTheNumber(num);
	System.out.println(result);
	}
	public static int doubleTheNumber(int num) {
		return num*2;
		
	}
}
	


