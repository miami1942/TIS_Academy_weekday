class ForTest2 
{
	public static void main(String[] args) 
	{
		/*[문제1] for루프를 이용해서 1부터 10까지 정수 값을 출력하세요.
		  [문제2] for루프를 이용해서 1부터 10까지의 합을 구하세요
		  [문제3] for루프를 이용해서 1부터 10까지의 곱을 구하세요
		  [문제4] 1~100까지의 수 중 17로 나누어 떨어지는 수만 출력하세요
		  [문제5] for루프를 이용해서 구구단 8단을 출력하세요.
		  [문제6] 알파벳 대문자를 for루프를 이용해 출력하세요.
		  */

			
		  for (int i=1;i<=10 ;i++ )
		  {
			  System.out.println(i);
			  
		  }
		  int sum=0;
		  for (int i=1;i<=10 ;i++ )
		  {
			  System.out.println(sum += i);
		  }
		  int gob=1;
		  for (int i=1;i<=10 ;i++ )
		  {
			  System.out.println(gob *= i);
		  }

		  
		  int nan=17;
		  for (int i=1;i<=100 ;i++ )
		  {if (i%nan==0)
			{
			 System.out.println(i);
			  }
		  }

		 
		  for (int i=1;i<=9 ;i++ )
		  {
			  System.out.println("8 x "+ i +" = " + i*8);
		  }

		  System.out.println();//줄바꿈

		  for (char c='A';c<=90 ;c++ )
		  //char에서는 숫자를 쓰면 아스키코드로 바뀌고 문자 그대로 쓰려면 ''를 붙여준다.
		  {
			  System.out.println(c);
		  }

		  for (int c=65;c<=90 ;c++ )
		  {
			  System.out.print((char)c+" ");
		  }


	}
}
