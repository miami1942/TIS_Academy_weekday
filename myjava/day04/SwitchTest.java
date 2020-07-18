import java.util.Scanner;

class SwitchTest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*
		아메리카노 : 2000원
		카푸치노, 카페라떼, 에스프레소 : 3000원
		딸기라떼 : 3500원
		public String next() => 문자열을 입력받고 반환함
		*/
		System.out.println("메뉴를 선택하세요=>");
		String menu=sc.next();
		System.out.println("선택하신 메뉴는: " + menu);
		/*
		switch(변수 or 수식)
		{
			case 값1: 실행문; break;
			case 값2: 실행문; break;
			case 값3: 실행문; break;
			default: 실행문;           <= if조건식의 else같은 느낌
		}
		*/
		int price=0;

		switch (menu)
		{
		case "아메리카노":price=2000;break;   //<=break가 없을 경우 내려와서 딸기라떼 가격으로 출력함.
		case "딸기라떼":price=3500;break;
		default:price=3000;
		// 이경우 없는'인삼차' 같은 메뉴를 써도 3000원이라고 출력함
		
		}
		System.out.println("가격은 : " + price + "입니다.");

	}
}
