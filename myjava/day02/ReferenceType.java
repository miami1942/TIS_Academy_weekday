import java.util.Date;

public class ReferenceType
{
	public static void main(String[] args) 
	{
		/*
		1. �⺻�ڷ���(Primitive type)
		2. ������ (Reference type) => Ŭ������, �������̽���, �迭
			=> ���������� ��ü�� ������ ����Ű�� ������ �ǹ�
			   ���������� ���� ���� �Ҵ��ؼ��� �ȵǰ� �ݵ��
			   new��� �����ڸ� �̿��ؼ� ��ü�� �����Ͽ��� �Ѵ�.
			   ��, ���ܰ� �ִ�. String�� ��� new�ص� ������
			   ���� ���� �Ҵ��ص� �ȴ�.
		*/
		Date today=new Date(); //������
		int num=100;//�⺻�ڷ���
		Object obj=new Object();
		System.out.println(today);
		System.out.println(num);
		System.out.println(obj);

		String str=new String("Hello");
		System.out.println(str);
		String str2="Hello";
		System.out.println(str2);

		int m=20;
		int n=30;
		System.out.println("��=>"+m+n);
		System.out.println("��=>"+(m+n));
		System.out.println(m+n+"<=��");


	}
}
