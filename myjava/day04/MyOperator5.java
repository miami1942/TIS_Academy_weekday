class MyOperator5 
{
	public static void main(String[] args) 
	{
		System.out.println("6. �Ҵ� ������, ������ ���Կ�����----");
		int i=1;
		i+=3; // i=i+3
		System.out.println("i="+i);
		int j=10;
		j-=4;
		System.out.println("j="+j);

		int k=25;
		k/=2; //k�� 2�� ���� �� = 12
		System.out.println("k="+k);

		k%=5; //k�� 5�� ���� ������ (�ٷ����� k�� 12�� �Ʊ⶧���� 5�γ����� 2�� �������� ��)
		System.out.println("k="+k);

		k*=3;// k�� ���ϱ� 3�� �϶����̾� (�ֱ� �������� ���� 2�� ��⶧���� ���� 6�̶� ���̾�)
		System.out.println("k="+k);

		int y=5; // 00000101
		y<<=2; //(shift����)
		System.out.println("y="+y);

		int x=3;				  // 0011
		x^=2; // x = x^2;		  	 0010
		System.out.println("x="+x);//0001  
	}
}
