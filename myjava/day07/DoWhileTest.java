class DoWhileTest
{
	public static void main(String[] args) 
	{
		/*
			��������;
			do{
				�ݺ� ������ ����;
				������;
			}while(���ǽ�);

			while ���� ��� ������ true�� �ݺ�����������,
			do~while���� ���� ������ false������
			�� ���� ������ �ϰ� �ݺ����� �����.
		*/
		int a=5;
		do
		{
			System.out.println("Hello: "+a);
			a+=3;
		}
		while (a<20);

		int b=5;
		do
		{
			System.out.println("Java: "+b);
			b+=3;
		}
		while (b<0);

		/*[����1] do~while������ �̿��� 1~100������ ����
		3�� ����̸鼭 3�� ����� ������ ����ϼ���
		
		  [����2] 1~30������ ���� 5�������� "����", 
				 10���� ���ٴ� "����"�� ����ϼ���.
				 1,2,3,4 -���� 6,7,8,9 -����...
		*/

		int i=12;
		do
		{
			System.out.println("3�ǹ���̸鼭 4�ǹ��: "+i);
			i+=12;
		}
		while (i<=100);

		int kong=1;
		do
		{
			/*if (kong%10==0)
				System.out.print("����\n");
			else if (kong%5==0)
				System.out.print("����, ");
			else
				System.out.print(kong+", ");*/
		if(kong%5==0){
			if(kong%10==0){
				System.out.print("����,");
			}else{
				System.out.print("����, ");
			}
			}else{
				System.out.print(kong+",");
			}
			kong+=1;
			
		}

		while (kong<=30);

		
		
		
	}
}