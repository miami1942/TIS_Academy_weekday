public class Casting
{
	public static void main(String[] args) 
	{
		System.out.println("����ȯ");
		int m=2;
		long n=5;
		float v=m*n;
		System.out.println("v="+v);
		
		//(�ڷ���)==> ����ȯ ������.
		byte b=(byte)v;
		//byte b=v;
		System.out.println("b="+b);
		/*
		--------> �ڵ�����ȯ(promotion)
		byte < short < int < long < float < double < char
		
			��������ȯ(casting)<-------
		ũ�Ⱑ ���� �������� ū �������� ��ȯ�� �Ͼ�� ����
		�ڵ�����ȯ(promotion)�̶� �Ѵ�.
		�ݸ�, �̿� �ݴ�������� ��ȯó���� �ϰ��� �� ����
		��������ȯ(casting)�� �ؾ� �Ѵ�.
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