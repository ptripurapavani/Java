import java.util.*;
public class SurfaceAreaApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double radius=scan.nextDouble();
	SurfaceArea explorer = new SurfaceArea();
	System.out.printf("%.2f",explorer.calculateSurfaceArea(3.0) );
}

}
