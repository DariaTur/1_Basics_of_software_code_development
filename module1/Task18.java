package by.epam.training.module1;
import java.util.Scanner;
//Для каждого натур числа в промежутке от m до n вывести все делители, кроме 1 и самого числа.

public class Task18 {

	public static void main(String[] args) {
		int m;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(">>");
		}
		m = sc.nextInt();
		
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(">>");
		}
		n = sc.nextInt();
		
		for(;m<=n; m++) {
			System.out.println("Делители числа "+m+":");
			for(int i = 2;i<m;i++) {
				if (m%i==0) {
					System.out.println(i);
				}
			}
		}
		

	}

}
