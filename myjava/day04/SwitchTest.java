import java.util.Scanner;

class SwitchTest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*
		�Ƹ޸�ī�� : 2000��
		īǪġ��, ī���, ���������� : 3000��
		����� : 3500��
		public String next() => ���ڿ��� �Է¹ް� ��ȯ��
		*/
		System.out.println("�޴��� �����ϼ���=>");
		String menu=sc.next();
		System.out.println("�����Ͻ� �޴���: " + menu);
		/*
		switch(���� or ����)
		{
			case ��1: ���๮; break;
			case ��2: ���๮; break;
			case ��3: ���๮; break;
			default: ���๮;           <= if���ǽ��� else���� ����
		}
		*/
		int price=0;

		switch (menu)
		{
		case "�Ƹ޸�ī��":price=2000;break;   //<=break�� ���� ��� �����ͼ� ����� �������� �����.
		case "�����":price=3500;break;
		default:price=3000;
		// �̰�� ����'�λ���' ���� �޴��� �ᵵ 3000���̶�� �����
		
		}
		System.out.println("������ : " + price + "�Դϴ�.");

	}
}
