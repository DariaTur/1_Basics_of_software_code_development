package by.epam.training.module1;
import java.util.Scanner;
/* Напишите программу, где пользователь вводит любое целое положительное число. 
А программа суммирует все числа от 1 до введённого пользователем числа. */

public class Task12 {

	public static void main(String[] args) {
		int num;
		int res = 0;
		
		System.out.print(">>");
		Scanner reader = new Scanner(System.in);
		while(!reader.hasNextInt()) {
			reader.nextLine();
			System.out.print(">>");
		}
		
		num = reader.nextInt();
		for(int i = 0; i<=num;i++) {
			res+=i;
		}
		System.out.println(res);

	}
  	
}
