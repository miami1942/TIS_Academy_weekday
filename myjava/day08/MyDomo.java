class MyDomo
{
		   int b=20;//�������� �ν��Ͻ�����=> "��ü��.����"������ �����ؾ���
	static int c=30;//�������� Ŭ���� ����=>"Ŭ������.����"�� ����

	public static void main(String[] args) 
	{
	    int a=10;//��������(local variable)
		System.out.println("a="+a);
		//System.out.println(MyDemo.b="b);
		//c�� ���� ��� �غ�����.
		System.out.println("c="+c);//��Ŭ���������� ����� ��� ��.
		System.out.println("MyDemo.c="+MyDomo.c);
		System.out.println(YourDomo.c);
		MyDomo md=new MyDomo();//��ü����
		//Heap�޸� ������ MyDomo��ü�� �ö�
		//md ==> ��ü�� �����ϴ� �̸�(��ü��)
		System.out.println("md.b="+md.b);
	  
	  
	}
}
