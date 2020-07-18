public class Primitive
{
	/*
	기본자료형(Primitive Type)
		1.정수형 2.실수형 3.문자형 4,논리형
	*/
	public static void main(String[] args)
	{
		System.out.println("1.정수형````");
		//byte, short, int, long
		byte b1=-12; // -128 ~127
		byte b2=126;
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		
		short s1=5000; //2byte
		System.out.println("s1="+s1);

		int i=50000; //4byte 정수형의 디폴트
		System.out.println("i="+i);

		long ln=40; //8byte 정수형중에 가장큰 것
		// ↑ 접미사(L)가 없으면 int로 잡아버림.
		long ln2=40L; //접미사 L, l 을 붙인다.
		System.out.println("ln="+ln);
		System.out.println("ln2="+ln2);

		int x=1000000000; /*0이 9개 int형의 
							최대 범위 2,147,483,647
						  */
		long y=10000000000L; //0이 10개
		System.out.println("x="+x);
		System.out.println("y="+y);


		int z=5;
		byte k=5;
		System.out.println("z="+z);
		System.out.println("k="+k);

		int a=010; //8진수, 앞에 접두어로 0을 붙이면 8진수. 0~7
		System.out.println("a="+a);

		int b=0x12; //16진수. 앞에 접두어로 0x를 붙인다.
		//			  0~9, a, b, c, d, e, f
		              // ↑ 10 11 12 13 14 15
		System.out.println("b="+b);
		
		int c=0234; //156
		System.out.println("c="+c); //십진수로 바꿔보기

		int d=0x1de; //478
		System.out.println("d="+d);

	}
}