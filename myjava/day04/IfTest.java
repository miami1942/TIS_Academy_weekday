import java.util.Scanner;

class IfTest 
{
	public static void main(String[] args) 
	{
		System.out.println("������ �Է��ϼ���=>");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
/*		if(num>0)
		{
			System.out.println("����Դϴ�");
		}
			System.out.println("����~");//<- ������ ������� ������ ��.
			*/
			/*
			if(���ǽ�){
				���๮1;
			}else{
				���๮2;
			}
			[�ǽ� if~else�� �̿��ؼ� �Է¹��� �� num�� ¦���̸�
			"¦���Դϴ�", Ȧ���� "Ȧ���Դϴ�"�� ����ϼ���]
			*/

if (num%2==0)
	System.out.println("¦���Դϴ�");
else
	System.out.println("Ȧ���Դϴ�");

if (num%2==0)
	System.out.println(num + "¦���Դϴ�");
else
	System.out.println(num + "Ȧ���Դϴ�");
System.out.println("����°");
if (num%2==0)
	System.out.println("" + num + "¦���Դϴ�");
else
	System.out.println("" + num + "Ȧ���Դϴ�");


System.out.println("����׿�����");
String fgh=(num%2==0)? num+"��(��) ¦��":num+"��(��) Ȧ��";
		System.out.println(fgh);

System.out.println("���ٷ� ǥ���ϱ�");
System.out.println((num%2==0)? num+"is Even":num+"is Odd");

		// ��������=(���ǽ�)? ��1:��2;


	}
}