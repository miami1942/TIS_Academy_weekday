public class Default
{
	/*
	- 클래스내에 선언한 변수.
	1. static 인 변수 (클래스 변수) ---> 전역변수
	2. static이 아닌 변수(인스턴스 변수)
	*/
	static int b; /*
				   전역 번수는 초기화 하지 않아도 디폴트 값이 들어간다.
				   디폴트 값 = 0
				  */
	static float f;
	static boolean g;
	static char ch;
	static String str;


	public static void main(String[] args) 
	{
		/*
		- 지역변수(local variable, automatic variable)
		   ↑ 메소드나 블럭 내부에서 선언된 변수
		- 지역변수는 반드시 초기값을 주고 사용해야 한다.
		*/
		int a; // 변수선언
		a=10; //'초기화' 한다고 표현함  <- 초기값을 할당
		double c=0.0;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("f="+f);
		System.out.println("g="+g);
		System.out.println("ch="+ch);
		System.out.println("str="+str);

	}
}
