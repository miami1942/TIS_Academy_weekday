public class Primitive2
{
	public static void main(String[] args)
	{
		System.out.println("2. �Ǽ���-----");
		/*
		float (4byte) : �����е�. �Ҽ��� ���� 7�ڸ�
		 -> �ε��Ҽ����� ��� ���̻� F,f�� �ٿ��ش�.
			�׷��� ������ double�� �ν��Ѵ�.
		double (8byte) : �����е�. �Ҽ��� ���� 15~16�ڸ�(����Ʈ)
		*/
		float a=1.234f;
		System.out.println("a="+a);
		float b=200;
		System.out.println("b="+b);
		//���������� ���� ū������ ������ ���� �ڵ���ȯ�� �Ͼ��.
		// => promotion (������ ����ȯ)
		float c=.7789f;
		System.out.println("c="+c);

		//double (8byte)
		double d=889.4789;
		System.out.println("d="+d);
		
		//������ ���� ǥ���� : E (����������)
		double x=123e-3;	//e-3�̶� 123 * 10^-3
		System.out.println("x="+x);

		double y=123e3;		//123 * 10^3
		System.out.println("y="+y);

		float f=3e2f;
		System.out.println("f="+f);

		float q=0345;
		System.out.println("q="+q);

		System.out.println("3. ������-----");
		//char : (2byte) 0 ~ 2^16-1(65535);
		//		��� ������ ��� ǥ������. �����ڵ� ü�踦 �����
		char ch='W';
		char ch2='��';
		char ch3='ʫ';
		System.out.println("ch="+ch);
		System.out.println("ch2="+ch2);
		System.out.println("ch3="+ch3);

		char ch4='\uff57'; //�����ڵ�(�ٸ����� ���)
							//���ڰ������迡 ����
		System.out.println("ch4="+ch4);
		char ch5=' ';//������ �������� space bar �� �־����.
						//�ƿ� '' �̷��Ը� �ع����� ������
		System.out.println("ch5="+ch5);
		//char ch6='AB'; [X]  <- char�� �ѱ��ڸ� �Ǵ°���
		char c1='A'; //65 (�ƽ�Ű�ڵ�)
		char c2='B'; //66 
		System.out.println(c1 + c2); //�̰� ""��� �Ǵ°���
		System.out.println(""+c1 + c2); //AB ��� ���ڷ�
										//������ �ϰ�������
										//""+���̰�
		/*
		int�� ������ �ڷ�����(byte,short,char)�� ���꿡
		���Ǹ� �ڵ����� int������ promotion(�ڵ�����ȯ)�� �Ͼ��.
		*/

		byte b1=1;
		byte b2=2;
		int b3=b1+b2;
		System.out.println("b3="+b3);

		System.out.println("4. ������----");
		//boolean (1byte) : true, false���� ���´�.
		// �ڹ��� �������� 0�̳� 1�� ȣȯ���� �ʴ´�. ����ȯ�� �Ұ����Ѵ�.
		boolean bool=true;
		//boolean bool2=1; [x]
		boolean bool3=2>3;
		System.out.println("bool="+bool);
		System.out.println("bool3="+bool3);

	}

}