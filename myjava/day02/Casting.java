public class Casting
{
	public static void main(String[] args) 
	{
		System.out.println("형변환");
		int m=2;
		long n=5;
		float v=m*n;
		System.out.println("v="+v);
		
		//(자료형)==> 형변환 연산자.
		byte b=(byte)v;
		//byte b=v;
		System.out.println("b="+b);
		/*
		--------> 자동형변환(promotion)
		byte < short < int < long < float < double < char
		
			강제형변환(casting)<-------
		크기가 작은 유형에서 큰 유형으로 변환이 일어나는 것을
		자동형변환(promotion)이라 한다.
		반면, 이와 반대방향으로 변환처리를 하고자 할 때는
		강제형변환(casting)을 해야 한다.
		*/

		int x=65;
		char c=(char)x;
		System.out.println("c="+c);
		System.out.println(c+1);////66====>B
		System.out.println((char)(c+1));

		byte b1=(byte)128;
		System.out.println("b1="+b1);
		byte b2=100;
		byte b3=(byte)(b1-b2);
		System.out.println("b3="+b3);
	}
}
