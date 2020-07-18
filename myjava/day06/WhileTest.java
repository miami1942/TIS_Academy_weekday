class WhileTest 
{
	public static void main(String[] args) 
	{
		/*
			변수 선언문, 초기화;
			while(조건식)
			{
				반복실행할 문장;
				증감식;
			}
			조건식이 true이면 실행할 문장을 수행한다.
				   false이면 while루프를 벗어난다.
		*/
		int a=1;
		while (a<5)
		{
			System.out.println("Hello : "+a);
			a++;
		}
		System.out.println("The End~~"+a);


		int b=100;
		while(b>10)
		{
			System.out.println("Hi: "+b);
			b-=5;
		}
		System.out.println("@@@@"+b);

		while(true)
			System.out.println("무한루프 돕니다.");
		//일부러 무한루프 편하게 돌리고 싶을때
	
	
	}
}
