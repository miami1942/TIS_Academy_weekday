import java.util.Scanner;

class SwitchTest4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("당신의 평균점수를 입력하세요=>");
		double avg=sc.nextDouble(); //실수 값을 받을때는 next Double!!
		System.out.println("Average: "+avg+"점");

		char ch=' ';
		switch ((int)avg/10)//int이하(byte, short, char, int) 또는 String
		{
		case 10: ch='A';break;
		case 9: ch='B';break;
		case 8: ch='C';break;
		case 7: ch='D';break;
		default :ch='F';
		System.out.println("학점: "+ch);
		
		}
		/*입력받은 평균 점수에 따른 학점을 출력하세요.
		100, 90점대: 'A'
		---
		60미만: 'F'
		단 switch~case문을 이용하기
		---switch(변수|수식) 안에는 int형 이하의 자료형과 String만 들어갈 수 있다.
		*/
	}
}
