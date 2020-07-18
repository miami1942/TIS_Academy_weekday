import java.util.Scanner;
class BreakGame{
	public static void main(String[] args){
		System.out.println("1~100까지 ㄱㄱ");
		Scanner sc=new Scanner(System.in);
		int r=(int)(Math.random()*100+1);
		int c=0;
			while (true){
			int num=sc.nextInt();
				if (num<1||num>100){
					System.out.println("퓽신 문제 제대로 읽어 1~100이라고");
				continue;
				}
				c++;
				
				if (num==r){
					System.out.println("삥퐁~~정답이히야~");
				break;
				}else if(num>r){
					System.out.println("Dawn, 좀더 내려봐");
				}else
					System.out.println("뉘에뉘에 그러시겟죠~ 올려");
			}
			System.out.println("겜고만하고 이제 공부해");
			System.out.println(c+"번이나 뚜두렸냐?");
	}
}
