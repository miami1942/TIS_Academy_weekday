import java.util.Scanner;

class StarPlus 
{
	public static void main(String[] args) 
	{
		System.out.println("���ϴ� ������ �Է��϶�~ �̸��̾�");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for (int a=1;a<=(num*2)-1 ;a++ )/*���� ����*/{
			for (int b=1;b<=num ;b++ )/*���� ����*/{
				if(a+b<=num*2 && b-a<1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	System.out.println();




		
		for (int a=1;a<=(num*2)-1 ;a++ )/*���� ����*/{
			/*int scnt=0;//���� ���ǿ� ���� ����
			if(i<=num){
				scnt=a;
			}else{
				scnt=num*2-a;
			 }*/
			 int scnt = (a<=num)? a:num*2-a;

			for (int b=1;b<=scnt ;b++ )/*���� ����*/{
				System.out.print("*");
			}
		System.out.println();
		}
	System.out.println();





			int k = 
			int j = 
			int q = 




















	System.out.println("---------------����ǽ�--------------");
	System.out.println("[4-1]");
	System.out.print("1.");
	int x=15;
		boolean bool= x>10 && x<20;;
		System.out.println(bool);
		
	}
}