import java.util.Scanner;

class WhileTest2 
{
	public static void main(String[] args) 
	{

		/*
		[문제1] while문을 이용해서 1~100까지의 수 중 홀수의 합을 구하세요*/
				
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




			
			
		
		System.out.println("Scanner를 이용해 구구단의 단수를 입력받은 뒤 해당 구구단을 출력 하되 while문을 사용하세요");
		/*[문제2] Scanner를 이용해 구구단의 단수를 입력받은 뒤
				 해당 구구단을 출력 하되 while문을 사용하세요
		*/
	Scanner sc=new Scanner(System.in);
	System.out.println("구구단의 단수를 입력하세요 =>");
	int dan=sc.nextInt();
	System.out.println("------"+dan+"단-----");
	int i=1;
	while(i<10)
		{
			System.out.println(dan+"x"+i+"="+dan*i);
			i++;
		}




		/*[문제3] 중첩 while문을 이용해서 구구단 전체를 아래와 같은 형식으로 출력하세요
				2x1=2		3x1=3		4x1=4 ....9x1=9
				2x2=4		3x2=6....
				....
				2x9=18		3x9=27  ...			  9x9=81
						*/
	
System.out.println("---------------구구단------------");
		int y=1;
		while(y<=9){//행의 조건
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
