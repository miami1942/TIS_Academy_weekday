public class MyOperator3
{
	public static void main(String[] args) 
	{
		System.out.println("5. ���� ������(���� ������)----");
		/*
		���� ���� = (���ǽ�)? ��1: ��2;
		���ǽ��� true�̸� ��1�� ������ �����ϰ�,
			   false�� ��2�� ������ �����Ѵ�.
		   �̶� ����. ������ ��1, ��2�� ���� �ڷ����̾���Ѵ�.
		*/
	int a=50;
	int b=60;
	int c=(a>b)? a:b;
	System.out.println("c="+c);

	/*
	String str=(a<b)? a:b;
	System.out.println("str="+str);
	�� String�� int�� �ȸ°� +""  �� �ٿ��ָ� ����ȭ�� ��
	*/
	String str=(a<b)? a+"":b+"";
	System.out.println("str="+str);

	}
}
