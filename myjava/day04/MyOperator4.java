import java.util.Scanner;

class MyOperator4 
{
	public static void main(String[] args) 
	{
		//���: System.out.println()
		//�Է�: System.in.read()
		System.out.println("������ �Է��ϼ���=>");
		Scanner sc=new Scanner(System.in);
		//public int nextInt() : ������ �Է¹ް� �̸� ��ȯ�Ѵ�.
		int num=sc.nextInt();
		System.out.println("����� �Է��� ��: "+num);
		/*
		num�� ���� ����̸� "����Դϴ�"
		�����̸� "�����Դϴ�"�� ����ϵ�, ���ǿ�����(���׿�����)
		�� �̿��ؼ� ����ϼ���.
		*/

		if(num>0)
			System.out.println(num+"�� ����Դϴ�");
		else
			System.out.println(num+"�� ����Դϴ�");

		//���� ���� = (���ǽ�)? ��1: ��2;

		String fgh=(num>0)? num+"�� ���":num+"�� ����";
		System.out.println(fgh);
if (num%2==0)
	System.out.println("¦���Դϴ�");
else
	System.out.println("Ȧ���Դϴ�");
{
}
	}
}