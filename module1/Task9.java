package by.epam.training.module1;
//Даны координаты трех точек.Определить, лежат ли они на одной прямой.

public class Task9 {

	public static void main(String[] args) {
		double x1 = 3;
		double y1 = 4;
		double x2 = 5;
		double y2 = 6;
		double x3 = 7;
		double y3 = 8;
		
		System.out.println("Лежат ли точки на одной прямой?");
		if ((y1-y2)*x3+(x2-x1)*y3+(x1*y2-x2*y1) == 0) {
			System.out.println("Да");
		} else {
			System.out.println("Нет");
		}

	}

}
