class ForTest 
{
	public static void main(String[] args) 
	{
		//반복문
		/* for(변수 초기화식;조건식;증감식)
		{
			반복실행할문장;
		}
		조건식이 true이면 실행할 문장을 실행함.
		*/
		for (int i=1;i<=3 ;i++ )
		{
			System.out.println("Hello World : "+i);
			//지역 변수 i는 for루프문 안에서 선언하였으므로
			//for로프 안에서만 사용가능.
		}
		System.out.println("The End~~"); //()안에 +i를 쓸수 없음.



		int j=5; //변수선언, 초기화
		for(;j>0;j--)
		{
			System.out.println("Hi Java "+j);
		}
	// for 루프 안에 있느냐 밖에 있느냐에 따라 살아 있는지 죽어있는지 확인 할 수 있음.
		System.out.println("*********"+j); 
		//지역변수 j의 scope(범위)는 main()메소드 블럭까지
		
		for (; ; )//무한루프
		{
			System.out.println("@@@");
		}

	}
}
