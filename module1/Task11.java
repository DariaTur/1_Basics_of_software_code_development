package by.epam.training.module1;
//Вычислить значение функции F(x). x^2-3x+9,если x<=3 или 1/(x^3+6),если x>3

public class Task11 {

	public static void main(String[] args) {
		double x = 5;
		
		if (x<=3) {
			System.out.println("x меньше или равно 3");
			System.out.println(Math.pow(x, 2)-3*x+9);
		} else {
			System.out.println("х больше 3");
			System.out.println(1/(Math.pow(x, 3)+6));
		}

	}

}
