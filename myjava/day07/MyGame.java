import java.util.Scanner;
/* 컴퓨터가 1~100사이의 임의의 정수를 발생시키면
	이를 맞추는 게임을 작성해봅시다.*/
class MyGame 
{
	public static void main(String[] args){
		System.out.println("1~100 까지 입력하라~ 이말이야");
		Scanner sc=new Scanner(System.in);
	//1~100 사이의 임의의 정수 발생시키기
	int n=(int)(Math.random()*100+1);
	// 무한루프 돌면서 "1~100 사이의 정수를 입력하세요"
	int count=0;
	while(true){
		
		int num=sc.nextInt();
			if (num<1||num>100){
					System.out.println("입력오류 1~100사이 정수여야 한다.");
					continue;
			}

			count++;
			if(num==n){
				System.out.println("정답입니다.^^!!");
				break;
			}else if(num>n){
				System.out.println("더 작은 수를 입력하세요");
			}else/*(num<n)*/{
				System.out.println("더 큰 수를 입력하세요");
			}
		
	}		
	System.out.println("the end");
	System.out.println("입력횟수: "+count);
 }
}

