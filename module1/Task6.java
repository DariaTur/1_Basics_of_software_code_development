package by.epam.training.module1;
//Для заданной области составить программу, которая печатает true, если точка с координатами (x,y) принадлежит закрашенной области, и false в противном случае.

public class Task6 {

	public static void main(String[] args) {
		double x = 2.0;
		double y = -4.0;
		if ((-2<=x & x<=2)&(y>=0 & y<=4)) {
			System.out.println("True");
		}else if ((-4<=x & x<=4)&(y>=-3 & y<=0)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
