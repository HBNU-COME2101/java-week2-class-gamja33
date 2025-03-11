package hello;
import java.util.Scanner;


public class chapter1_5 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요>>");
		int age = scanner.nextInt();
		int red;
		int blue;
		int yellow;
		
		if(age > 0 ) {
			red = age/10;
			age = age%10;
			blue = age/5;
			yellow = age%5;
			
			System.out.print("\n");
			if(red>0) {
				System.out.print("빨간 초"+red+"개,");
			}
			if(blue>0) {
				System.out.print("파란 초"+blue+"개");
			}
			if(yellow>0) {
				System.out.print(", 노란 초"+yellow+"개");
			}
			System.out.print(" 총"+(red+blue+yellow)+"개가 필요합니다.");
		}
		else {
			System.out.print("나이는 양수로만 입력하세요.");
		}
	}
}
