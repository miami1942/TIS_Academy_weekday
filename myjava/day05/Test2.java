class Test2 
{
	public static void main(String[] args) 
	{
		int numOfApples=123;//사과개수
		int sizeOfBucket=10;//바구니 크기
		int numOfBucket=0;
		
		if(numOfApples % sizeOfBucket==0)
		{numOfBucket=numOfApples/sizeOfBucket;}
		else
		{numOfBucket=numOfApples/sizeOfBucket+1;}
		//위 문장을 삼항 연산자로 바꿔보시오			
		System.out.println("필요한바구니수 : "+numOfBucket);

		int num= 123;
		int num2= num/100*100;
		System.out.println(num2);

		int num3=333;
		int num4= num3/10 * 10 + 1;
		System.out.println(num4);


	}
}
