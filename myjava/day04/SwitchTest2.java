import java.util.Scanner;

class SwitchTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1~12�� ������ ���� �Է� �ϼ���");
		int month=sc.nextInt();
		if(month<1 || month>12)
			{
			System.out.println("�Է� ����!! 1~12���� ���� �Է� �ϼ���");
			return; // <- JVM���� ���ư�.(main���� �������� ���α׷� ����)
			}
        String day=" ";
		switch (month)
		{
		/*case "1��" : day="~31�ϱ���" ; break;
		case "2��" : day="���ش� 29�ϱ���" ; break;
		case "3��" : day="~31�ϱ���" ; break;
		case "4��" : day="~30�ϱ���" ; break;
		case "5��" : day="~31�ϱ���" ; break;
		case "6��" : day="~30�ϱ���" ; break;
		case "7��" : day="~31�ϱ���" ; break;
		case "8��" : day="~31�ϱ���" ; break;
		case "9��" : day="~30�ϱ���" ; break;
		case "10��" : day="~31�ϱ���" ; break;
		case "11��" : day="~30�ϱ���" ; break;
		case "12��" : day="~31�ϱ���" ; break;*/
		case 2: day="~28�� ����"; break;
		case 6:
		case 9:
		case 11:
		case 4: day="30�ϱ���"; break;
		default:day="31�ϱ���";
		}
		//int�� ��쿡 case �ٷεڿ� ""�� ������ �ʾƵ� �ȴ�.
		System.out.println(month + "���� " + day + " �Դϴ�.");

		/*
		case 2: day=28; break;
		case 6:
		case 9:
		case 11:
		case 4: day=30; break;
		default:
			day=31;

			- 1�� �̸��̰ų� 12�� �ʰ��ϸ�"�Է¿���
		*/
		
	}
}