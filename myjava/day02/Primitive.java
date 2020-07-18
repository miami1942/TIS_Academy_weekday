public class Primitive
{
	/*
	�⺻�ڷ���(Primitive Type)
		1.������ 2.�Ǽ��� 3.������ 4,����
	*/
	public static void main(String[] args)
	{
		System.out.println("1.������````");
		//byte, short, int, long
		byte b1=-12; // -128 ~127
		byte b2=126;
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		
		short s1=5000; //2byte
		System.out.println("s1="+s1);

		int i=50000; //4byte �������� ����Ʈ
		System.out.println("i="+i);

		long ln=40; //8byte �������߿� ����ū ��
		// �� ���̻�(L)�� ������ int�� ��ƹ���.
		long ln2=40L; //���̻� L, l �� ���δ�.
		System.out.println("ln="+ln);
		System.out.println("ln2="+ln2);

		int x=1000000000; /*0�� 9�� int���� 
							�ִ� ���� 2,147,483,647
						  */
		long y=10000000000L; //0�� 10��
		System.out.println("x="+x);
		System.out.println("y="+y);


		int z=5;
		byte k=5;
		System.out.println("z="+z);
		System.out.println("k="+k);

		int a=010; //8����, �տ� ���ξ�� 0�� ���̸� 8����. 0~7
		System.out.println("a="+a);

		int b=0x12; //16����. �տ� ���ξ�� 0x�� ���δ�.
		//			  0~9, a, b, c, d, e, f
		              // �� 10 11 12 13 14 15
		System.out.println("b="+b);
		
		int c=0234; //156
		System.out.println("c="+c); //�������� �ٲ㺸��

		int d=0x1de; //478
		System.out.println("d="+d);

	}
}