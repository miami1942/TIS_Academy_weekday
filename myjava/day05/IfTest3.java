import java.io.IOException;

public class IfTest3
{
	public static void main(String[] args) 
		throws IOException
	{
		System.out.println("0~9 ������ ���� �Ǵ� ���ڸ� �Է��ϼ��� =>");
		char input=(char)System.in.read();
		System.out.println("input="+input);

		/*[����] �Է¹��� ���� 0~9���� ���̸� "�����̱���",
				���� ���ĺ� �빮���̰ų� �ҹ����̸� "���ĺ��Դϴ�".
				�׿� �����̸� "��Ÿ �����Դϴ�"�� ����ϼ���*/
				if (input>='0' && input<='9')//���� �ƽ�Ű�ڵ�� �Ǿ� ���� ���� ���� �� (���� char�� �ؾߵ�)
				//�ƴϸ� ''�� �ٿ��� ����ȭ ��Ų��.
					System.out.println(input + "�� �����Դϴ�.");
				else if((input>='A' && input<='Z')||(input>='a' && input<='z'))
					// '&&' ����� '||' �����߿� '&&'������ �켱������ �� ����.
					System.out.println(input + "�� �����Դϴ�");
				else
					System.out.println(input + "�� ��Ÿ�����Դϴ�.");


	}
}