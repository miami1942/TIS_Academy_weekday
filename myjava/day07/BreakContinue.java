class BreakContinue
{
	public static void main(String[] args) 
	{
		
		System.out.println("1.------------------------");
		for (int i=0;i<3 ;i++ )
		{
			if (i==1) break;
			//break; ���� ����� �ݺ����� �����.
			System.out.println("i="+i);
		}

		System.out.println("2.------------------------");
		for (int i=0;i<3 ;i++ )
		{
			if (i==1) continue;
			/*continue; continue���� ������ �� ������ ������
						�������� �ʰ� ���� �ݺ��� ���� ���������� �Ѿ
						�� �ݺ����� ��� �����Ѵ�.*/
			System.out.println("i="+i);
		}
		/*�������� ����� �������ּ���*/
		System.out.println("3.------------------------");
		for (int i=0;i<3 ;i++ )
		{
			for (int k=0;k<3 ;k++ )
			{
				if(k==1) break;
				System.out.println("i="+i+", k="+k);
			}
		}

		
		System.out.println("4.------------------------");
		for (int i=0;i<3 ;i++ )
		{
			for (int k=0;k<3 ;k++ )
			{
				if(k==1) continue;
				System.out.println("i="+i+", k="+k);
			}
		}
		
		System.out.println("5.------------------------");
		//�ݺ��� �տ� ���̺�(label)�� ������ �� �ִ�.
		outer: //:�� �ٿ��� ��!
		for (int i=0;i<3 ;i++ )
		{
			inner:
			for (int k=0;k<3 ;k++ )
			{
				if(k==1) break outer;//���̺�����
				//������ ���̺� �ݺ����� ��Ż��
				System.out.println("i="+i+", k="+k);
			}
		}
		
		System.out.println("6.------------------------");
		outer: //:�� �ٿ��� ��!
		for (int i=0;i<3 ;i++ ){
			inner:
			for (int k=0;k<3 ;k++ ){
				if(k==1) continue outer;//���̺�����
				//������ ���̺� �ݺ����� ��� ������
				System.out.println("i="+i+", k="+k);
			}
		}

	}
}