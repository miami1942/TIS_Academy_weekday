import java.util.Scanner;

class IfTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("���� ���� �Է�=>");
		int kor=sc.nextInt();
		System.out.println("���� ���� �Է�=>");
		int eng=sc.nextInt();
		System.out.println("���� ���� �Է�=>");
		int meth=sc.nextInt();
		int c=kor+eng+meth;
		int d=c/3;
		
		//double d=c/3.0; <='3.0'�� �Ǽ��� �ƴ� ������ �Է����� ���� ���� ���� �Ҽ������� ����������.
		  //�� int ������ int �� int�� ���� int(����)�� ����

		System.out.println("����: " + kor);
		System.out.println("����: " + eng);
		System.out.println("����: " + meth);
		System.out.println("�հ� ������ = "+ c);
		System.out.println("��� ������ = "+ d);
//����
  char hak=' ';
if(d>=90){
	hak='A';
}else if(d>=80){
	hak='B';
}else if (d>=70)
{
	hak='C';
}else if (d>=60)
{
	hak='D';
}else
	hak='F';

		//if ���ǹ��� �������϶� ���������� ������ �����Ǹ� �ؿ����� �Ⱥ�

		if (d>=95 && d<=100)
			System.out.println("A+");
		else if ((90<=d) && (d<95))
			System.out.println("A");
		else if ((85<=d) && (d<90))
			System.out.println("B+");
		else if ((80<=d) && (d<85))
			System.out.println("B");
		else if ((75<=d) && (d<80))
			System.out.println("C+");
		else if ((70<=d) && (d<75))
			System.out.println("C");
		else if ((65<=d) && (d<70))
			System.out.println("D+");
		else if ((60<=d) && (d<65))
			System.out.println("D");
		else if ((0<=d) && (d<60))
			System.out.println("F");
		else
			System.out.println("�Է¿���!! ������ 0~100�� ���̾�� �ؿ�");


	}
}