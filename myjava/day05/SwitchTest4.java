import java.util.Scanner;

class SwitchTest4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("����� ��������� �Է��ϼ���=>");
		double avg=sc.nextDouble(); //�Ǽ� ���� �������� next Double!!
		System.out.println("Average: "+avg+"��");

		char ch=' ';
		switch ((int)avg/10)//int����(byte, short, char, int) �Ǵ� String
		{
		case 10: ch='A';break;
		case 9: ch='B';break;
		case 8: ch='C';break;
		case 7: ch='D';break;
		default :ch='F';
		System.out.println("����: "+ch);
		
		}
		/*�Է¹��� ��� ������ ���� ������ ����ϼ���.
		100, 90����: 'A'
		---
		60�̸�: 'F'
		�� switch~case���� �̿��ϱ�
		---switch(����|����) �ȿ��� int�� ������ �ڷ����� String�� �� �� �ִ�.
		*/
	}
}