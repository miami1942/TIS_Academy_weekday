import java.util.Scanner;

class MyOperator4 
{
	public static void main(String[] args) 
	{
		//출력: System.out.println()
		//입력: System.in.read()
		System.out.println("정수를 입력하세요=>");
		Scanner sc=new Scanner(System.in);
		//public int nextInt() : 정수를 입력받고 이를 반환한다.
		int num=sc.nextInt();
		System.out.println("당신이 입력한 값: "+num);
		/*
		num의 값이 양수이면 "양수입니다"
		음수이면 "음수입니다"를 출력하되, 조건연산자(삼항연산자)
		를 이용해서 출력하세요.
		*/

		if(num>0)
			System.out.println(num+"은 양수입니다");
		else
			System.out.println(num+"은 양수입니다");

		//변수 선언문 = (조건식)? 값1: 값2;

		String fgh=(num>0)? num+"은 양수":num+"은 음수";
		System.out.println(fgh);
if (num%2==0)
	System.out.println("짝수입니다");
else
	System.out.println("홀수입니다");
{
}
	}
}
