
/*
-----------------------------------
�⺻�ڷ���				������(Wrapper class)
-----------------------------------
byte				Byte
short				Short
char				Character
int					Interger
long				Long
float				Float
double				Double
boolean				Boolean

*/

class  Wrapper
{
	public static void main(String[] args) 
	{
		//java.lang.IntegerŬ������ �ʵ�(�������)
		//1) static int MAX_VALUE
		//2) static int MIN_VALUE
		
		//[����1] MAX_VALUE, MIN_VALUE ���� ����ϼ���.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);



		//�޼ҵ�
		//static int parseInt(String s)
		//���ڿ��� ���������� ��ȯ�ؼ� ��ȯ ���ִ� �޼ҵ�
		//[����2] �Ʒ� ������ ������ ��ȯ�ؼ� ��� �ϼ���
		String str="1122";
		int b=Integer.parseInt(str);
		System.out.println(b+3000);//���ڿ� ����


	}
}
