import java.util.Scanner;

class StarPlus 
{
	public static void main(String[] args) 
	{
		System.out.println("원하는 갯수를 입력하라~ 이말이야");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for (int a=1;a<=(num*2)-1 ;a++ )/*행의 조건*/{
			for (int b=1;b<=num ;b++ )/*열의 조건*/{
				if(a+b<=num*2 && b-a<1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	System.out.println();




		
		for (int a=1;a<=(num*2)-1 ;a++ )/*행의 조건*/{
			/*int scnt=0;//열의 조건에 사용될 변수
			if(i<=num){
				scnt=a;
			}else{
				scnt=num*2-a;
			 }*/
			 int scnt = (a<=num)? a:num*2-a;

			for (int b=1;b<=scnt ;b++ )/*열의 조건*/{
				System.out.print("*");
			}
		System.out.println();
		}
	System.out.println();





			int k = 
			int j = 
			int q = 




















	System.out.println("---------------제어실습--------------");
	System.out.println("[4-1]");
	System.out.print("1.");
	int x=15;
		boolean bool= x>10 && x<20;;
		System.out.println(bool);
		
	}
}
