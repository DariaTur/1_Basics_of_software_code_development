package by.epam.training.module1;
import java.util.Scanner;
//Даны 2 угла треугольника в градусах. Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task7 {

	public static void main(String[] args) {
		double edge1;
		double edge2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 2 угла:");
		System.out.print(">>");
		while(!in.hasNextDouble()) {
			in.nextLine();
			System.out.print(">>");
		}
		edge1 = in.nextDouble();
		
		System.out.print(">>");
		while(!in.hasNextDouble()) {
			in.nextLine();
			System.out.print(">>");
		}
		edge2 = in.nextDouble();
		
		System.out.println("Является ли треугольником?");
		if (180-edge1-edge2 > 0) {
			System.out.println("Да");
			if (180-edge1-edge2 == 90) {
				System.out.println("Прямоугольный");
			}
		}else {
			System.out.println("Нет");
		}

	}

}
