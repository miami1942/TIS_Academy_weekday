public class test
{
	public static void main(String[] args) 
	{
		byte b=10;
		char ch='A';
		int i=100;
		long l=100;

		b=(byte)i;
		//i�� byte �����ȿ� ���� ���̱⶧����
		//�Ʒ��� �������� ������ȯ�� ���־����.(�ڵ�x)
		ch=(char)b;
		//short s=ch(X)
		short s=(short)ch;
		float f=(float)i;
		i=(int)ch;
	}
}