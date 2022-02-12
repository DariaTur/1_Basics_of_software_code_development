package by.epam.training.module1;
import java.util.Scanner;
/*Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. 
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: HHч MMмин SSс */

public class Task5 {

	public static void main(String[] args) {
		int time ;
		int hours;
		int minutes;
		int seconds;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print(">>");
		while(!in.hasNextDouble()) {
			in.nextLine();
			System.out.print(">>");
		}
		time = in.nextInt();
		
		hours = (int)(time/360);
		minutes = (int)((time - hours*360)/60);
		seconds = time - hours*360 - minutes*60;
		
		System.out.println(hours+"ч "+minutes+"мин "+seconds+"с");
		
	}

}
