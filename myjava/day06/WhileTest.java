class WhileTest 
{
	public static void main(String[] args) 
	{
		/*
			���� ����, �ʱ�ȭ;
			while(���ǽ�)
			{
				�ݺ������� ����;
				������;
			}
			���ǽ��� true�̸� ������ ������ �����Ѵ�.
				   false�̸� while������ �����.
		*/
		int a=1;
		while (a<5)
		{
			System.out.println("Hello : "+a);
			a++;
		}
		System.out.println("The End~~"+a);


		int b=100;
		while(b>10)
		{
			System.out.println("Hi: "+b);
			b-=5;
		}
		System.out.println("@@@@"+b);

		while(true)
			System.out.println("���ѷ��� ���ϴ�.");
		//�Ϻη� ���ѷ��� ���ϰ� ������ ������
	
	
	}
}
