class ForTest 
{
	public static void main(String[] args) 
	{
		//�ݺ���
		/* for(���� �ʱ�ȭ��;���ǽ�;������)
		{
			�ݺ������ҹ���;
		}
		���ǽ��� true�̸� ������ ������ ������.
		*/
		for (int i=1;i<=3 ;i++ )
		{
			System.out.println("Hello World : "+i);
			//���� ���� i�� for������ �ȿ��� �����Ͽ����Ƿ�
			//for���� �ȿ����� ��밡��.
		}
		System.out.println("The End~~"); //()�ȿ� +i�� ���� ����.



		int j=5; //��������, �ʱ�ȭ
		for(;j>0;j--)
		{
			System.out.println("Hi Java "+j);
		}
	// for ���� �ȿ� �ִ��� �ۿ� �ִ��Ŀ� ���� ��� �ִ��� �׾��ִ��� Ȯ�� �� �� ����.
		System.out.println("*********"+j); 
		//�������� j�� scope(����)�� main()�޼ҵ� ������
		
		for (; ; )//���ѷ���
		{
			System.out.println("@@@");
		}

	}
}
