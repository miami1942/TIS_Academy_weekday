import java.util.Scanner;
class RockScisorPaper
{
	public static void menu(){
		System.out.println("*****Game Menu*****");
		System.out.println("1.가위 2.바위 3.보 9.종료");
		System.out.println("********************");
		System.out.println("입력하세요=>");
		System.out.println("********************");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//반복문 돌면서
		int count=0;
		while (true){
		int com=(int)(Math.random()*3+1);

		RockScisorPaper.menu(); //메뉴보여주고
		int no=sc.nextInt();    //입력받고(내가 낸 가위, 바위, 보)
		//컴퓨터가 1,2,3 중 하나 값을 랜덤하게 발생시킨다.
		//내가 비겼는지, 이겼는지, 졌는지 판단.
				if (no==9){
					System.out.println("프로그램 종료");
					//System.out.println("벌써 "+count+"판 째네?");
				break;}
				if (no<1||no>3){
					System.out.println("메뉴조오오옴 보라고오");
				continue;}
			System.out.println("당  신:"+no);
			System.out.println("컴퓨터:"+com);
				count++;
				if(no==com){
					System.out.println("비김");
				}else if((com-no==1)||(no-com==2)){
					System.out.println("짐");
				}else
					System.out.println("이김");
		}//while-------------
		
			System.out.println("벌써 "+count+"판 째네?");
	}
}
