import javax.swing.JOptionPane;

class Wrapper2
{
	public static void main(String[] args) 
	{
		String str=JOptionPane.showInputDialog("����1�� �Է��ϼ���");
		System.out.println("str: "+str);

		String str2=JOptionPane.showInputDialog("����2�� �Է��ϼ���");
		System.out.println("str2: "+str2);

		//�� ���� ���� ���� ���� ����ϼ���.
		System.out.println(str+"+"+str2);

		int a=Integer.parseInt(str);
		int b=Integer.parseInt(str2);
		System.out.println("�ΰ��� �� = "+(a+b));
		//�����İ� ����� ����ϱ�
		System.out.println(a+" x "+b+" = "+(a*b));

	}
}