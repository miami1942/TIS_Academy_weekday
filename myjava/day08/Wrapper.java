
/*
-----------------------------------
기본자료형				참조형(Wrapper class)
-----------------------------------
byte				Byte
short				Short
char				Character
int					Interger
long				Long
float				Float
double				Double
boolean				Boolean

*/

class  Wrapper
{
	public static void main(String[] args) 
	{
		//java.lang.Integer클래스의 필드(멤버변수)
		//1) static int MAX_VALUE
		//2) static int MIN_VALUE
		
		//[문제1] MAX_VALUE, MIN_VALUE 값을 출력하세요.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);



		//메소드
		//static int parseInt(String s)
		//문자열을 정수형으로 변환해서 반환 해주는 메소드
		//[문제2] 아래 변수를 정수로 변환해서 출력 하세요
		String str="1122";
		int b=Integer.parseInt(str);
		System.out.println(b+3000);//문자열 결합


	}
}
