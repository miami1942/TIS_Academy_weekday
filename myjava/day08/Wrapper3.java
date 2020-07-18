import javax.swing.JOptionPane;

class Wrapper3
{
	public static void main(String[] args) 
	{
		String str=JOptionPane.showInputDialog("정수1를 입력하세요");
		System.out.println("str: "+str);

		//[1]입력한 정수값의 2진수 값을 출력하세요.
		//static String toBinaryString(int i):	 정수i의 이진수 문자열을 반환
		int two=Integer.parseInt(str);
		String twoo=Integer.toBinaryString(two);
			System.out.println("2진수 값은 = "+twoo);
		
		//[2]입력한 정수값의 8진수 값을 출력하세요.
		//static String toOctalString(int i) :	 8진수
		int eight=Integer.parseInt(str);
		String ei=Integer.toOctalString(eight);
			System.out.println("8진수 값은 = "+ei);

			System.out.println(Integer.toHexString(two));
		//[3]입력한 정수값의 16진수 값을 출력하세요.
		//static String toHexString(int i)	 :	 16진수
		int sibyuk=Integer.parseInt(str);
		String yuk=Integer.toHexString(sibyuk);
			System.out.println("16진수 값은 = "+yuk);
	}
}
