class MathTest2 
{
	public static void main(String[] args) 
	{
		/*java.lang.MathŬ������
		  static double random() �޼ҵ� Ȱ��
		  0.0<= r < 1.0
		
		[����1] 0<= r < 10 ������ ������ ������ �߻����� ��� �ϼ���.
		
		[����2] 5<= r < 15 ������ ������ ������ �߻����� ��� �ϼ���.
		*/

		int rn=(int)(Math.random()*10);
			
			System.out.println(rn);


		int r=(int)(Math.random()*10)+5;
			System.out.println(r);

		/*
		  (	Math.random()* ���� + ���ۼ�)
		*/
		//[����3] 16 < = 38 ������ ������ ����
		// ���� : 38-16 = 22
		//���ۼ� : 16
		
		int r1=(int)(Math.random()*22)+16;
			System.out.println(r1);

		//[����4] 105 <= r4 < 213 ������ ������ ������ ��� �Ͻÿ�

		int r4=(int)(Math.random()*22)+16;
			System.out.println(r4);

		/* 'A' <= r5 <'Z'   <= Z���� ���Ե��� �ʾ�
		 ����: 90-65 + 1         +1 ���־�� ��

		*/

		/*[����5] ���ĺ� �빮�ڸ� �������� �����Ͽ� �Ʒ��� ���� ��� �ǵ��� �ϼ���
			G O P W U
			S A Z Q G
			C E X O I
		*/
		
			for (int a=1;a<=3 ;a++ ){
				for (int b=1;b<=5 ;b++ ){
					char ch=(char)(Math.random()*26+65);// double + int= double , char + char= int
					System.out.print(ch+" ");
				}
			System.out.print("\n");
			}
			
			
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
