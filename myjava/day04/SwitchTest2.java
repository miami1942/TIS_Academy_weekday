import java.util.Scanner;

class SwitchTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1~12월 사이의 월을 입력 하세요");
		int month=sc.nextInt();
		if(month<1 || month>12)
			{
			System.out.println("입력 오류!! 1~12사이 값을 입력 하세요");
			return; // <- JVM으로 돌아감.(main문에 있을때만 프로그램 종료)
			}
        String day=" ";
		switch (month)
		{
		/*case "1월" : day="~31일까지" ; break;
		case "2월" : day="올해는 29일까지" ; break;
		case "3월" : day="~31일까지" ; break;
		case "4월" : day="~30일까지" ; break;
		case "5월" : day="~31일까지" ; break;
		case "6월" : day="~30일까지" ; break;
		case "7월" : day="~31일까지" ; break;
		case "8월" : day="~31일까지" ; break;
		case "9월" : day="~30일까지" ; break;
		case "10월" : day="~31일까지" ; break;
		case "11월" : day="~30일까지" ; break;
		case "12월" : day="~31일까지" ; break;*/
		case 2: day="~28일 까지"; break;
		case 6:
		case 9:
		case 11:
		case 4: day="30일까지"; break;
		default:day="31일까지";
		}
		//int일 경우에 case 바로뒤에 ""를 붙이지 않아도 된다.
		System.out.println(month + "월은 " + day + " 입니다.");

		/*
		case 2: day=28; break;
		case 6:
		case 9:
		case 11:
		case 4: day=30; break;
		default:
			day=31;

			- 1월 미만이거나 12월 초과하면"입력오류
		*/
		
	}
}
