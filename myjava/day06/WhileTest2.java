import java.util.Scanner;

class WhileTest2 
{
	public static void main(String[] args) 
	{

		/*
		[����1] while���� �̿��ؼ� 1~100������ �� �� Ȧ���� ���� ���ϼ���*/
				
		/*int d=1;
		int s=0;
			while(d<=100){
				if (d%2==1)
				System.out.println(s += d);
				d++;
				}*/


		int sum=0;
		int a=1;
		while(a<101)
		{
			
			if(a%2==1){
				if(a<99)
					System.out.print(a+"+");
				else
					System.out.print(a+"=");
				sum+=a;}
				a++;

		}
		System.out.println(sum);

		


	int gug=1;
		while(gug<=9){
			int re=2;
			while(re<=9){
				System.out.print(re + "x"+ gug + "=" + re*gug + "\t");
				re++;}
			}
			gug++;




			
			
		
		System.out.println("Scanner�� �̿��� �������� �ܼ��� �Է¹��� �� �ش� �������� ��� �ϵ� while���� ����ϼ���");
		/*[����2] Scanner�� �̿��� �������� �ܼ��� �Է¹��� ��
				 �ش� �������� ��� �ϵ� while���� ����ϼ���
		*/
	Scanner sc=new Scanner(System.in);
	System.out.println("�������� �ܼ��� �Է��ϼ��� =>");
	int dan=sc.nextInt();
	System.out.println("------"+dan+"��-----");
	int i=1;
	while(i<10)
		{
			System.out.println(dan+"x"+i+"="+dan*i);
			i++;
		}




		/*[����3] ��ø while���� �̿��ؼ� ������ ��ü�� �Ʒ��� ���� �������� ����ϼ���
				2x1=2		3x1=3		4x1=4 ....9x1=9
				2x2=4		3x2=6....
				....
				2x9=18		3x9=27  ...			  9x9=81
						*/
	
System.out.println("---------------������------------");
		int y=1;
		while(y<=9){//���� ����
			int x=2;
			while(x<=9){
				System.out.print(x+"x"+y+"="+x*y+"\t");
				x++;
					   }
			System.out.println();
			y++;
	    		   }
		
	}
}