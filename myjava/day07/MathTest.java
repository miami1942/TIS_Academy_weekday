class MathTest 
{
	public static void main(String[] args){

		/*java.lang.MathŬ������ ������ �ִ� �ʵ�(��������)
			public static double PI
		
		��������		
		(1) static����=> Ŭ���� ����(��������)
			static������ ����Ϸ��� "Ŭ������.����" ������ �����ؾ� �Ѵ�.
		(2) static�� �ƴ� ����(non-static) => �ν��Ͻ� ����
				"��ü��.����" ������ �����ؾ� �Ѵ�.
		(public) static int		max(int a,int b)  
		����������	 ������	��ȯŸ��  �޼ҵ��(�Ű�����)
		- ��� : �Ű������� ���� a,b �� �� ���� �ִ밪�� ��ȯ���ش�.

		(public) static int min(int a,int b) 
		  :		 �ּҰ��� ��ȯ

		*/

		System.out.println("Math.PI= "+Math.PI);
		//System.out.println("PI="+PI);

		int x=Math.max(2,5);
		//System.out.println(Math.max(2,5));
		System.out.println("x="+x);

		int y=Math.min(2,5);
		System.out.println("y="+y);

		//static long   round(double a)  : a���� �ݿø����� ��ȯ��
		//static double floor(double a)  : �������� ��ȯ
		//static double ceil(double a)   : �ø����� ��ȯ
		
		//401.654�� �ݿø����� ��� �غ�����.
		//-123.12�� �������� �ø����� ���� ����غ�����.

		//double half=Math.round(401.654);
		long half=Math.round(401.654);
		System.out.println("half="+half);

		double down=Math.floor(-123.12);
		double up=Math.ceil(-123.12);
		System.out.println("down="+down);
		System.out.println("up="+up);

		/*static double random(): 
				0.0���� ũ�ų� ���� 1.0 �̸��� ������ ������ �߻���Ų��.
				0.0 <= r < 1.0
		*/
		double rn=Math.random();
		 if (rn<0.5)
			 System.out.println("��");
		 else
			 System.out.println("��÷");
		 

	}
}
