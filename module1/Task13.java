package by.epam.training.module1;
//Вычислить значения функции на отрезке [a,b] с шагом h. y = x, x>2 or y = -x, x<=2

public class Task13 {

	public static void main(String[] args) {
		double a;
		double b = 7.5;
		int h = 2;
		
		for(a = 1.6; a<=b; a+=h) {
			if (a<=2) {
				System.out.println(-a);
			}else {
				System.out.println(a);
			}
		}

	}

}
