class Test2 
{
	public static void main(String[] args) 
	{
		int numOfApples=123;//�������
		int sizeOfBucket=10;//�ٱ��� ũ��
		int numOfBucket=0;
		
		if(numOfApples % sizeOfBucket==0)
		{numOfBucket=numOfApples/sizeOfBucket;}
		else
		{numOfBucket=numOfApples/sizeOfBucket+1;}
		//�� ������ ���� �����ڷ� �ٲ㺸�ÿ�			
		System.out.println("�ʿ��ѹٱ��ϼ� : "+numOfBucket);

		int num= 123;
		int num2= num/100*100;
		System.out.println(num2);

		int num3=333;
		int num4= num3/10 * 10 + 1;
		System.out.println(num4);


	}
}