public class Variable
// �������̸��� �����ϰ�
{
	//public : ����������(access modifier)
	//static : modifier
	//void : �޼ҵ��� ��ȯŸ���� ������� void�� �����Ѵ�.
	//(String[] args) : �Ű����� args => �ڷ������� StringŸ���� �迭
	public static void main(String[] args)
		//public�� static�� �ٲ� �������
		//[]�� �迭�� �ǹ���
	{
		System.out.println("����");
		int myNum=100; //������ �ҹ��ڷ� ����. ���������� ���´�.
		    //��ī��ǥ���(��Ÿǥ����̶��)
		int your_num=200;
		System.out.println(myNum);
		System.out.println(your_num);
		System.out.println(myNum+your_num);//300
		System.out.println(myNum*your_num);//20000

		int radius=5;
		double pi=3.14;
		//�� ������ �̿��ؼ� �������� 5�� ���� ������ ����غ�����
		System.out.println(radius*radius*pi);
		
		//����: variable, field, property, argment(�Ű�����)
		//�ڷ��� ������ ; ��������
		int a=-10;//���� ����� ���ÿ� �ʱⰪ�� �ο�
		double b;//���� ����
		b=20.12;//�ʱ�ȭ
		System.out.println("a="+a);
		System.out.println("b="+b);
		//���ڿ� + ���� => ���ڿ� ������ �Ͼ

		String str="�ȳ�?";
		System.out.println("str="+str);
	}


}