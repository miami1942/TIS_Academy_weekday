import java.util.Scanner;
//��������� ����ϴ� ���α׷�
class SwitchTest5 
{
	public static void main(String[] args) 
	{
		System.out.println("---Menu---");
		System.out.println("1. ������ (liter�� 50��)");
		System.out.println("2. ����� (liter�� 40��)");
		System.out.println("3. ������ (liter�� 30��)");
		System.out.println("--------------------)");
		System.out.println("�޴� ��ȣ�� �����ϼ���=>");
		System.out.println("----------------------");
		Scanner sc=new Scanner(System.in);
		int menuNo=sc.nextInt();
		System.out.println("menuNo: "+menuNo);
		if(menuNo<1 || menuNo>3)
		{System.out.println("�޴��� ���¹�ȣ����!!");
			return;}
		System.out.println("��뷮�� �Է��ϼ���=>");
		int use=sc.nextInt();
		if(use<0)
		{System.out.println("��뷮�� 0�̻��� ���� �Է��ؾ� �ؿ�");
			return;}
		System.out.println("��뷮: "+use+" ����");
		System.out.println("------------------------");
		
		int price=0;

		if(menuNo==1)
		{price = use*50;//������ 50��
		}else if(menuNo==2)
		{price = use*40;//����� 40��
		}else if(menuNo==3)
		{price = use*30;//������ 30��
		}else
		{
			System.out.println("�޴��� ���� ��ȣ����!!");
		}
		double tax=price*0.05;
		System.out.println("������� "+price+"��");
		System.out.println("��   ��: "+((int)tax)+"��");
		System.out.println("�Ѽ������: "+(price+((int)tax))+"��");
		
		
		
		
		
		
		
		
		
		
		/*int a=50;
		int b=40;
		int c=30;
		
		switch (oper)
		{
		case '+':a=num1+num2; break;
		case '-':a=num1-num2; break;
		case '*':a=num1*num2; break;
		case '/':a=num1/num2; break;
		case '%':a=num1%num2; break;
		default :System.out.println("�޴��� ���� �����ڿ���!!");
					return;

		System.out.println("" + num1 + oper + num2+"="+a);



		System.out.println(menuNo+a);*/
		
		/* ����� ����
		   1) ��� ��� = ��뷮 *���ʹ� ����(�ܰ�)
		   2) ����(������� 5%) ����� * 5/100
		   3) �Ѽ��� ��� (�����+����)
		
		*/
	}
}
