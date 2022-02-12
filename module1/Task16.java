package by.epam.training.module1;

/*Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, 
модуль которых больше или равен заданному е. Общий член ряда: an=1/2^n+1/3^n*/

public class Task16 {

	public static void main(String[] args) {
		double e = 0.1;
		double sum = 0;
		double res;
		
		for(int i = 1; ;i++) {
			res = 1/Math.pow(2, i)+1/Math.pow(3, i);
			if (Math.abs(res)>=e) {
				sum+=res;
			} else {
				break;
			}
		}
		System.out.println(sum);

	}

}
