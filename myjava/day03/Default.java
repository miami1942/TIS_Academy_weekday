public class Default
{
	/*
	- Ŭ�������� ������ ����.
	1. static �� ���� (Ŭ���� ����) ---> ��������
	2. static�� �ƴ� ����(�ν��Ͻ� ����)
	*/
	static int b; /*
				   ���� ������ �ʱ�ȭ ���� �ʾƵ� ����Ʈ ���� ����.
				   ����Ʈ �� = 0
				  */
	static float f;
	static boolean g;
	static char ch;
	static String str;


	public static void main(String[] args) 
	{
		/*
		- ��������(local variable, automatic variable)
		   �� �޼ҵ峪 ���� ���ο��� ����� ����
		- ���������� �ݵ�� �ʱⰪ�� �ְ� ����ؾ� �Ѵ�.
		*/
		int a; // ��������
		a=10; //'�ʱ�ȭ' �Ѵٰ� ǥ����  <- �ʱⰪ�� �Ҵ�
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