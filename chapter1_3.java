package hello;
import java.util.Scanner;
public class chapter1_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int year = number/10000;
		int month = number%10000/100;
		int day = number%100;
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
	}
}