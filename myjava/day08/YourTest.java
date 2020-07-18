class YourTest 
{
	//반환타입이 있는 메소드 => 메소드 블럭끝에서 return문장을 작성해야 함
	//					   또한 반환타입에 해당하는 값을 return 해야한다.
	public static int giveMe(int money){
		System.out.println("투자금: "+money+"만원");

		return money*2;
	}

	public String giveToUpper(String str){
		System.out.println("str: "+str);
		return str.toUpperCase();//(non-static)대문자로 변경해줌 
	}
	public static void main(String[] args) 
	{
		YourDomo yd=new YourDomo();
		yd.a(5);//4

		System.out.println(yd.b(8));

		YourDomo.c(5);//5

		//giveMe()메소드를 호출하세요
		System.out.println("Hello World!");
		int m=YourTest.giveMe(100);
		System.out.println("반환금: "+m+"만원");

		System.out.println("----------------------------------------------");

		YourTest yt=new YourTest();
		String d=yt.giveToUpper("hello Java");
		System.out.println("받아야돼: "+d);


	}
}
