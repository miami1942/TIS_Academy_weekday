class MathTest2 
{
	public static void main(String[] args) 
	{
		/*java.lang.Math클래스의
		  static double random() 메소드 활용
		  0.0<= r < 1.0
		
		[문제1] 0<= r < 10 사이의 임의의 정수를 발생시켜 출력 하세요.
		
		[문제2] 5<= r < 15 사이의 임의의 정수를 발생시켜 출력 하세요.
		*/

		int rn=(int)(Math.random()*10);
			
			System.out.println(rn);


		int r=(int)(Math.random()*10)+5;
			System.out.println(r);

		/*
		  (	Math.random()* 범위 + 시작수)
		*/
		//[문제3] 16 < = 38 사이의 임의의 정수
		// 범위 : 38-16 = 22
		//시작수 : 16
		
		int r1=(int)(Math.random()*22)+16;
			System.out.println(r1);

		//[문제4] 105 <= r4 < 213 사이의 임의의 정수를 출력 하시오

		int r4=(int)(Math.random()*22)+16;
			System.out.println(r4);

		/* 'A' <= r5 <'Z'   <= Z값이 포함되지 않아
		 범위: 90-65 + 1         +1 해주어야 함

		*/

		/*[문제5] 알파벳 대문자를 무작위로 추출하여 아래와 같이 출력 되도록 하세요
			G O P W U
			S A Z Q G
			C E X O I
		*/
		
			for (int a=1;a<=3 ;a++ ){
				for (int b=1;b<=5 ;b++ ){
					char ch=(char)(Math.random()*26+65);// double + int= double , char + char= int
					System.out.print(ch+" ");
				}
			System.out.print("\n");
			}
			
			
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
