import java.util.Scanner;
class RockScisorPaper
{
	public static void menu(){
		System.out.println("*****Game Menu*****");
		System.out.println("1.���� 2.���� 3.�� 9.����");
		System.out.println("********************");
		System.out.println("�Է��ϼ���=>");
		System.out.println("********************");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//�ݺ��� ���鼭
		int count=0;
		while (true){
		int com=(int)(Math.random()*3+1);

		RockScisorPaper.menu(); //�޴������ְ�
		int no=sc.nextInt();    //�Է¹ް�(���� �� ����, ����, ��)
		//��ǻ�Ͱ� 1,2,3 �� �ϳ� ���� �����ϰ� �߻���Ų��.
		//���� ������, �̰����, ������ �Ǵ�.
				if (no==9){
					System.out.println("���α׷� ����");
					//System.out.println("���� "+count+"�� °��?");
				break;}
				if (no<1||no>3){
					System.out.println("�޴��������� ������");
				continue;}
			System.out.println("��  ��:"+no);
			System.out.println("��ǻ��:"+com);
				count++;
				if(no==com){
					System.out.println("���");
				}else if((com-no==1)||(no-com==2)){
					System.out.println("��");
				}else
					System.out.println("�̱�");
		}//while-------------
		
			System.out.println("���� "+count+"�� °��?");
	}
}
