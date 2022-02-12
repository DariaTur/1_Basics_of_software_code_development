package by.epam.training.module1;

//Дано действительное число R вида nnn.ddd. Поменять местами дробную и целую части числа

public class Task4 {

	public static void main(String[] args) {
		double R = 335.464;
		double a = (int)R;
		double res = R*1000%1000+a/1000;
		System.out.println(res);
	}

}
