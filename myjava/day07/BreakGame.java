import java.util.Scanner;
class BreakGame{
	public static void main(String[] args){
		System.out.println("1~100���� ����");
		Scanner sc=new Scanner(System.in);
		int r=(int)(Math.random()*100+1);
		int c=0;
			while (true){
			int num=sc.nextInt();
				if (num<1||num>100){
					System.out.println("���� ���� ����� �о� 1~100�̶��");
				continue;
				}
				c++;
				
				if (num==r){
					System.out.println("����~~����������~");
				break;
				}else if(num>r){
					System.out.println("Dawn, ���� ������");
				}else
					System.out.println("�������� �׷��ð���~ �÷�");
			}
			System.out.println("�װ��ϰ� ���� ������");
			System.out.println(c+"���̳� �ѵηȳ�?");
	}
}
