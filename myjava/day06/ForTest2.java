class ForTest2 
{
	public static void main(String[] args) 
	{
		/*[����1] for������ �̿��ؼ� 1���� 10���� ���� ���� ����ϼ���.
		  [����2] for������ �̿��ؼ� 1���� 10������ ���� ���ϼ���
		  [����3] for������ �̿��ؼ� 1���� 10������ ���� ���ϼ���
		  [����4] 1~100������ �� �� 17�� ������ �������� ���� ����ϼ���
		  [����5] for������ �̿��ؼ� ������ 8���� ����ϼ���.
		  [����6] ���ĺ� �빮�ڸ� for������ �̿��� ����ϼ���.
		  */

			
		  for (int i=1;i<=10 ;i++ )
		  {
			  System.out.println(i);
			  
		  }
		  int sum=0;
		  for (int i=1;i<=10 ;i++ )
		  {
			  System.out.println(sum += i);
		  }
		  int gob=1;
		  for (int i=1;i<=10 ;i++ )
		  {
			  System.out.println(gob *= i);
		  }

		  
		  int nan=17;
		  for (int i=1;i<=100 ;i++ )
		  {if (i%nan==0)
			{
			 System.out.println(i);
			  }
		  }

		 
		  for (int i=1;i<=9 ;i++ )
		  {
			  System.out.println("8 x "+ i +" = " + i*8);
		  }

		  System.out.println();//�ٹٲ�

		  for (char c='A';c<=90 ;c++ )
		  //char������ ���ڸ� ���� �ƽ�Ű�ڵ�� �ٲ�� ���� �״�� ������ ''�� �ٿ��ش�.
		  {
			  System.out.println(c);
		  }

		  for (int c=65;c<=90 ;c++ )
		  {
			  System.out.print((char)c+" ");
		  }


	}
}