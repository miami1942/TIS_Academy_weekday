import javax.swing.JOptionPane;

class Wrapper3
{
	public static void main(String[] args) 
	{
		String str=JOptionPane.showInputDialog("����1�� �Է��ϼ���");
		System.out.println("str: "+str);

		//[1]�Է��� �������� 2���� ���� ����ϼ���.
		//static String toBinaryString(int i):	 ����i�� ������ ���ڿ��� ��ȯ
		int two=Integer.parseInt(str);
		String twoo=Integer.toBinaryString(two);
			System.out.println("2���� ���� = "+twoo);
		
		//[2]�Է��� �������� 8���� ���� ����ϼ���.
		//static String toOctalString(int i) :	 8����
		int eight=Integer.parseInt(str);
		String ei=Integer.toOctalString(eight);
			System.out.println("8���� ���� = "+ei);

			System.out.println(Integer.toHexString(two));
		//[3]�Է��� �������� 16���� ���� ����ϼ���.
		//static String toHexString(int i)	 :	 16����
		int sibyuk=Integer.parseInt(str);
		String yuk=Integer.toHexString(sibyuk);
			System.out.println("16���� ���� = "+yuk);
	}
}
