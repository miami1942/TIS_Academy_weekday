import java.util.Scanner;
import java.io.IOException;
class SeitchTest3 
{
	public static void main(String[] args)
		throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("정수1을 입력하세요");
		int num1=sc.nextInt();

		System.out.println("연산자[+,-,*,/,%]를 입력하세요=>");
		char oper=(char)System.in.read();

		System.out.println("정수2를 입력하세요=>");
		int num2=sc.nextInt();
		/*
		switch ~case 문을 이용해서 입력받은 값의 수식과 결과값을 출력하세요
		*/
		int a;
		switch (oper)
		{
		case '+':a=num1+num2; break;
		case '-':a=num1-num2; break;
		case '*':a=num1*num2; break;
		case '/':a=num1/num2; break;
		case '%':a=num1%num2; break;
		default :System.out.println("메뉴에 없는 연산자에요!!");
					return;
		}

		System.out.println("" + num1 + oper + num2+"="+a); // ""(문자열) 이 먼저오면 나머지는 모두 문자화가 된다.
	}
}
