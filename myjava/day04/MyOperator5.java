class MyOperator5 
{
	public static void main(String[] args) 
	{
		System.out.println("6. 할당 연산자, 연산후 대입연산자----");
		int i=1;
		i+=3; // i=i+3
		System.out.println("i="+i);
		int j=10;
		j-=4;
		System.out.println("j="+j);

		int k=25;
		k/=2; //k를 2로 나눈 몫 = 12
		System.out.println("k="+k);

		k%=5; //k를 5로 나눈 나머지 (바로위에 k가 12가 됐기때문에 5로나누면 2가 나머지가 됨)
		System.out.println("k="+k);

		k*=3;// k에 곱하기 3을 하란말이야 (최근 나머지로 인해 2가 됬기때문에 답은 6이란 말이야)
		System.out.println("k="+k);

		int y=5; // 00000101
		y<<=2; //(shift연산)
		System.out.println("y="+y);

		int x=3;				  // 0011
		x^=2; // x = x^2;		  	 0010
		System.out.println("x="+x);//0001  
	}
}
