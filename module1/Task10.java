package by.epam.training.module1;
//Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Task10 {

	public static void main(String[] args) {
		double a = 4;
		double b = 5;
		double x = 3;
		double y = 7;
		double z = 6;
		
		if ((x<=b && y<=a) || (y<=a && z<=b) || (x<=b && z<=a)){
			System.out.println("Пройдёт");
		} else {
			System.out.println("Не пройдёт");
		}

	}

}
