package by.epam.training.module1;

//Вычислить: (b+sqrt(b^2+4ac))/2a -a^3c+b^-2
public class Task2 {

	public static void main(String[] args) {
		double a = 78.9;
		double b = 67.4;
		double c = 23.7;
		double result;
		
		result = (b+Math.sqrt(Math.pow(b, 2.0)+4*a*c))/(2*a)-Math.pow(a, 3.0)*c+Math.pow(b, -2.0);
		
		System.out.println(result);
	}

}
