package by.epam.training.module1;
import java.util.Scanner;
//Вычислить (sinx+cosy)*tg(xy)/(cosx-siny)


public class Task3 {

	public static void main(String[] args) {
		double x;
		double y;
		double result;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print(">>");
		while(!in.hasNextDouble()) {
			in.nextLine();
			System.out.print(">>");
		}
		x = in.nextDouble();
		
		System.out.print(">>");
		while(!in.hasNextDouble()) {
			in.nextLine();
			System.out.print(">>");
		}
		y = in.nextDouble();
		
		result = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
		System.out.println(result);
	}

}	