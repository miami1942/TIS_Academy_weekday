class OurDemo
{
	/*2. 멤버 메소드
		 1) static인 메소드 ===> 클래스 메소드  =>"클래스명.메소드명()"
		 2) non-static 메소드==> 인스턴스 메소드=>"객체명.메소드명()"
	*/
	public static void showStar(){
		System.out.println("★★★★");
	}
	public void showCircle(){
		System.out.println("○○○○○");
	}
	public static void main(String[] args) 
	{
		YourDomo yd=new YourDomo();
		System.out.println(YourDomo.c);
		
		/*
		//showStar()메소드를 호출하세요
		System.out.println("Hello World!");
		OurDemo.showStar();
			
		//showCircle() 호출하기
		OurDemo od=new OurDemo();
		od.showCircle();

		//Foo 클래스의 aaa()메소드를 호출하세요
		
		
		//Foo클래스의 bbb()메소드를 호출하세요
		Foo.bbb();
		Foo f=new Foo();*/
	 /* System.out.println(f.aaa());  <= 메소드인 애들은 출력문에 쓰일수없음*/
		/*f.aaa();
		f.bbb(); //가능은 하나 권장하는 방법은 아님.*/
	}
}
