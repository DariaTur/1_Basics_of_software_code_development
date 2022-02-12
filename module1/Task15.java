package by.epam.training.module1;
//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task15 {

	public static void main(String[] args) {
		long mult = 1l;
		for(int i = 1; i<201; i++) {
			if (mult*i*i == 0) {
				System.out.println("Слишком большое число, последнее умноженное число: "+(i-1));
				break;
			}
			mult *= i*i ; 
		}
		System.out.println("Результат: "+mult);
		
	}

}
