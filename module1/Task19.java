package by.epam.training.module1;

//Даны два числа. Определить цифры, входящее в запись как первого так и второго числа.

public class Task19 {
	
	public static int[] numbers(int num){
        int n = 0;
        int num2 = num;
        int[] mas ;
        
        if(num<0) {
        	num *=-1;
        }
        
        while(num2!=0){
            num2 /=10;
            n++;
        }
        mas = new int[n];
        for(int i = n-1; i>=0;i--){
            mas[i] = num%10;
            num /= 10;
        }
        return mas;
    }
    
	public static void main(String[] args) {
		int num1 = 111;
		int num2 = 111;
		
		System.out.println("Одинаковые цифры:");
		for(int i:numbers(num1)) {
			for(int j:numbers(num2)) {
				if(i==j) {
					System.out.println(i);
					i = -1;
				}
			}
		}
	}
}
