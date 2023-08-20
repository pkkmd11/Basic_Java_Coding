package pk;
import java.util.Scanner;
public class Listing_8_3 {
public static void main(String[]args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter the number of points: ");
	int NOP = input.nextInt();
	double[][] points = new double[NOP][2];
	System.out.println("Enter"+NOP+"pints: ");
	for(int i=0; i<points.length;i++) {
		points[i][0] = input.nextDouble();
		points[i][1] = input.nextDouble();
	}
	
	int p1 =0, p2=1;
	double SD = distance(points[p1][0], points[p1][1],points[p2][0],points[p2][1]);
	
	for(int i=0; i<points.length; i++) {
		for(int j=i+1; j<points.length;j++) {
			double distance = distance (points[i][0],points[i][1],points[j][0],points[j][1]);
			if(SD>distance) {
				p1=i;
				p2=j;
				SD = distance;
			}
		}
	}
	System.out.println("The closest two points are " +
	"("+points[p1][0]+","+points[p1][1]+ ") and ("+ points [p2][0]+", "+ points[p2][1]+")");
	
}

private static double distance(double x1, double y1, double x2, double y2) {
	// TODO Auto-generated method stub
	
	return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
}
}
