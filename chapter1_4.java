import java.util.Scanner;
public class chapter1_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("여행지 >> ");
		String destination = input.nextLine();
		
		System.out.print("\n인원수 >> ");
		int number = input.nextInt();
		
		System.out.print("\n숙박일 >> ");
		int day = input.nextInt();
		
		System.out.print("\n1인당 항공료 >> ");
		int air_cost = input.nextInt();
		
		System.out.print("\n1방 숙박비 >> ");
		int day_cost = input.nextInt();
		

		int room  = number / 2;
		if (number % 2 > 0) {
			room = room + 1;
		}
		System.out.println(number+"명의"+destination+" "+day+"박 "+(day+1)+"일 여행에는 "+room+"개 필요하며 경비는 "+(number*air_cost+room*day_cost*day)+" 원 입니다.");
		
	}

}
