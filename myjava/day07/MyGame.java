import java.util.Scanner;
/* ��ǻ�Ͱ� 1~100������ ������ ������ �߻���Ű��
	�̸� ���ߴ� ������ �ۼ��غ��ô�.*/
class MyGame 
{
	public static void main(String[] args){
		System.out.println("1~100 ���� �Է��϶�~ �̸��̾�");
		Scanner sc=new Scanner(System.in);
	//1~100 ������ ������ ���� �߻���Ű��
	int n=(int)(Math.random()*100+1);
	// ���ѷ��� ���鼭 "1~100 ������ ������ �Է��ϼ���"
	int count=0;
	while(true){
		
		int num=sc.nextInt();
			if (num<1||num>100){
					System.out.println("�Է¿��� 1~100���� �������� �Ѵ�.");
					continue;
			}

			count++;
			if(num==n){
				System.out.println("�����Դϴ�.^^!!");
				break;
			}else if(num>n){
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else/*(num<n)*/{
				System.out.println("�� ū ���� �Է��ϼ���");
			}
		
	}		
	System.out.println("the end");
	System.out.println("�Է�Ƚ��: "+count);
 }
}

