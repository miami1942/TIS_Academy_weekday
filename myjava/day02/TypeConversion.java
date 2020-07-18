public class TypeConversion
{
	public static void main(String[] args) 
	{
		byte b=127;
		int i=100;
		System.out.println(b+i);
		System.out.println(10/4);//int 나누기 int는 int임(소수X)
		System.out.println(10.0/4);//이경우는 double로 나옴
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		/*
		00000000 00000000 00000000 11100011

		*/
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);

		/*
		227
		113...1
		56...1
		*/
	}
}
