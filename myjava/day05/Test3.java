import java.io.IOException;
class Test3 
{
	public static void main(String[] args) 
		throws IOException
	{
		/*char ch='A';
		char lowerCase = (�빮�ڿ��θ� �Ǻ��ϴ� ����   )?  :  ch;
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase: "+lowerCase);*/

















		System.out.println("���ĺ��� �Է��ϼ���=>");
		char ch=(char)System.in.read();
		char lowerCase = (ch>='A'&&ch<='Z')? (char)(ch+32) :  ch;
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase: "+lowerCase);
























	}
}