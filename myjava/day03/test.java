public class test
{
	public static void main(String[] args) 
	{
		byte b=10;
		char ch='A';
		int i=100;
		long l=100;

		b=(byte)i;
		//i가 byte 범위안에 들어가는 것이기때문에
		//아래로 내려갈땐 강제변환을 써주어야함.(자동x)
		ch=(char)b;
		//short s=ch(X)
		short s=(short)ch;
		float f=(float)i;
		i=(int)ch;
	}
}
