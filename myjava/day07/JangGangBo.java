import java.util.Scanner;
class JangGangBo
{
	public static void menu(){
		System.out.println("*****Game Menu*****");
		System.out.println("1.가위 2.바위 3.보 9.종료");
		System.out.println("********************");
		System.out.println("입력하세요=>");
		System.out.println("********************");
	}
			    //↓'반환타입'이라고함
	public static String show(int num){
		String str="";
		switch (num){
			case 1: str="가위[☞]";break;
			case 2: str="바위[●]";break;
			case 3: str="보[▦]";break;

		}

		return str;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int no=0;
		while (true){
			JangGangBo.menu();//메뉴보여주고
			no=sc.nextInt();    //입력받고(내가 낸 가위, 바위, 보)
				if (no==9) break;
				if(no<1||no>3){
					System.out.println("메뉴에 없는 번호에요!!");
					continue;
				}
				int com=(int)(Math.random()*3+1);
				//show()메소드 호출해보기
				String s1=JangGangBo.show(no);
				String s2=JangGangBo.show(com);

				System.out.println("당신 : "+no+". "+s1);
				System.out.println("컴퓨터 : "+com+". "+s2);
				//비긴경우
				if(no==com){
					System.out.println("비겼군요!!");
				}else if((no==1&&com==3)||(no==2&&com==1)
						||(no==3&&com==2)){
					//내가 이긴경우
					System.out.println("당신이 이졌네요^^");
				}else{
					System.out.println("졌네요 ㅜㅜ");
				}


		}//while-------------
			System.out.println("다신오지마~");
		
	}
}
