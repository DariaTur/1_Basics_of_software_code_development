package by.epam.training.module1;
//Найти max{min(a,b),min(c,d)}
public class Task8 {

	public static void main(String[] args) {
		double a=12;
		double b=23;
		double c=38;
		double d=10;
		
		System.out.println(Math.max(Math.min(a, b),Math.min(c,d)));
	}

}
