class practice 
{
	public static void main(String[] args) 
	{
		int x=2;//int x=2, y=5�� �ؿ���
		int y=5;
		char c='A'; //'A' �����ڵ�=65
	// 10000000 00000000 00000000 00000001
		System.out.println(1+x<<33);
		//����Ʈ ���갰����<=���ͷ� �ؿ� ���� ���Ծȵ�
		System.out.println(y >= 5 || x < 0 && x > 2);//&&�� ||���� ���� �Ѵ�.
		System.out.println(y += 10 - x++);
		//13  <=++�̳�, --�� ���ͷ��̰� �����̰� �����ϰ� ���� �׿� �����
		System.out.println(x+=2);//5
		System.out.println(!('A' <= c && c <= 'Z'));
		//false
		System.out.println('C'-c);//2   char-char = int!!
		System.out.println('5'-'0');//5
		System.out.println(c+1);//66   char+int=int
		System.out.println(++c);//66 ++�� 
		System.out.println(c++);//66
		System.out.println(c);//67

		int a=123; //����� ����
		int b=10;
		//�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int d=a/b;if (a%b>0)
			System.out.println(d+=1);

		
		/*System.out.println("�ʿ��� �ٱ����� ���� " + d + "�Դϴ�.");

		int num=456;
		int mum=num%100;
		System.out.println(num-mum);

		int gum=333;
		System.out.println()*/
		
	}
}