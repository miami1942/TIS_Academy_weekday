import java.util.Scanner;
import java.io.IOException;
class SeitchTest3 
{
	public static void main(String[] args)
		throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("����1�� �Է��ϼ���");
		int num1=sc.nextInt();

		System.out.println("������[+,-,*,/,%]�� �Է��ϼ���=>");
		char oper=(char)System.in.read();

		System.out.println("����2�� �Է��ϼ���=>");
		int num2=sc.nextInt();
		/*
		switch ~case ���� �̿��ؼ� �Է¹��� ���� ���İ� ������� ����ϼ���
		*/
		int a;
		switch (oper)
		{
		case '+':a=num1+num2; break;
		case '-':a=num1-num2; break;
		case '*':a=num1*num2; break;
		case '/':a=num1/num2; break;
		case '%':a=num1%num2; break;
		default :System.out.println("�޴��� ���� �����ڿ���!!");
					return;
		}

		System.out.println("" + num1 + oper + num2+"="+a); // ""(���ڿ�) �� �������� �������� ��� ����ȭ�� �ȴ�.
	}
}