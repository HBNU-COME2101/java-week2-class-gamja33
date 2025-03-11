import java.util.Scanner;
public class Chapter1_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("(x1, y1), (x2,y2)의 좌표 입력 >> ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		boolean x_include = false;
		boolean y_include = false;
		if (x1 <= x2) {
			if(x1 >= 10 && x2 <= 200) {
				x_include = true;
			}
		} else {
			if(x2 >= 10 && x1 <= 200) {
				x_include = true;
				}
			}
		
		if (y1 <= y2) {
			if(y1 >= 10 && y2 <= 300) {
				y_include = true;
			}
		} else {
			if(y2 >= 10 && y1 <= 300) {
				y_include = true;
				}
			}
		
		if(x_include&&y_include) {
			System.out.print("("+x1+", "+y1+",)("+x2+", "+y2+") 사각형은 (10, 10) (200, 300) 사각형에 포함된다.");
		}
		else {
			System.out.print("("+x1+", "+y1+",)("+x2+", "+y2+") 사각형은 (10, 10) (200, 300) 사각형에 포함하지 않는다.");
			
		}
	}
}