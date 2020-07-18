import java.util.Scanner;
//수도요금을 계산하는 프로그램
class SwitchTest5 
{
	public static void main(String[] args) 
	{
		System.out.println("---Menu---");
		System.out.println("1. 가정용 (liter당 50월)");
		System.out.println("2. 상업용 (liter당 40월)");
		System.out.println("3. 공업용 (liter당 30월)");
		System.out.println("--------------------)");
		System.out.println("메뉴 번호를 선택하세요=>");
		System.out.println("----------------------");
		Scanner sc=new Scanner(System.in);
		int menuNo=sc.nextInt();
		System.out.println("menuNo: "+menuNo);
		if(menuNo<1 || menuNo>3)
		{System.out.println("메뉴에 없는번호에요!!");
			return;}
		System.out.println("사용량을 입력하세요=>");
		int use=sc.nextInt();
		if(use<0)
		{System.out.println("사용량은 0이상의 값을 입력해야 해요");
			return;}
		System.out.println("사용량: "+use+" 리터");
		System.out.println("------------------------");
		
		int price=0;

		if(menuNo==1)
		{price = use*50;//가정용 50원
		}else if(menuNo==2)
		{price = use*40;//상업용 40원
		}else if(menuNo==3)
		{price = use*30;//공업용 30원
		}else
		{
			System.out.println("메뉴에 없는 번호에요!!");
		}
		double tax=price*0.05;
		System.out.println("사용요금은 "+price+"원");
		System.out.println("세   금: "+((int)tax)+"원");
		System.out.println("총수도요금: "+(price+((int)tax))+"원");
		
		
		
		
		
		
		
		
		
		
		/*int a=50;
		int b=40;
		int c=30;
		
		switch (oper)
		{
		case '+':a=num1+num2; break;
		case '-':a=num1-num2; break;
		case '*':a=num1*num2; break;
		case '/':a=num1/num2; break;
		case '%':a=num1%num2; break;
		default :System.out.println("메뉴에 없는 연산자에요!!");
					return;

		System.out.println("" + num1 + oper + num2+"="+a);



		System.out.println(menuNo+a);*/
		
		/* 출력할 내용
		   1) 사용 요금 = 사용량 *리터당 가격(단가)
		   2) 세금(사용요금의 5%) 사용요금 * 5/100
		   3) 총수도 요금 (사용요금+세금)
		
		*/
	}
}
