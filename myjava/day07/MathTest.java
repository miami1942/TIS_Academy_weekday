class MathTest 
{
	public static void main(String[] args){

		/*java.lang.Math클래스가 가지고 있는 필드(전역변수)
			public static double PI
		
		전역변수		
		(1) static변수=> 클래스 변수(전역변수)
			static변수를 사용하려면 "클래스명.변수" 식으로 접근해야 한다.
		(2) static이 아닌 변수(non-static) => 인스턴스 변수
				"객체명.변수" 식으로 접근해야 한다.
		(public) static int		max(int a,int b)  
		접근지정자	 지정자	반환타입  메소드명(매개변수)
		- 기능 : 매개변수로 들어온 a,b 두 값 중의 최대값을 반환해준다.

		(public) static int min(int a,int b) 
		  :		 최소값을 반환

		*/

		System.out.println("Math.PI= "+Math.PI);
		//System.out.println("PI="+PI);

		int x=Math.max(2,5);
		//System.out.println(Math.max(2,5));
		System.out.println("x="+x);

		int y=Math.min(2,5);
		System.out.println("y="+y);

		//static long   round(double a)  : a값의 반올림값을 반환함
		//static double floor(double a)  : 내림값을 반환
		//static double ceil(double a)   : 올림값을 반환
		
		//401.654의 반올림값을 출력 해보세요.
		//-123.12의 내림값과 올림값을 각각 출력해보세요.

		//double half=Math.round(401.654);
		long half=Math.round(401.654);
		System.out.println("half="+half);

		double down=Math.floor(-123.12);
		double up=Math.ceil(-123.12);
		System.out.println("down="+down);
		System.out.println("up="+up);

		/*static double random(): 
				0.0보다 크거나 같고 1.0 미만인 임의의 난수를 발생시킨다.
				0.0 <= r < 1.0
		*/
		double rn=Math.random();
		 if (rn<0.5)
			 System.out.println("꽝");
		 else
			 System.out.println("당첨");
		 

	}
}
