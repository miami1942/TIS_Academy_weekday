class MyOperator2 
{
	public static void main(String[] args) 
	{
		System.out.println("3. �� ������(>, >=, <, <=, ==, !=)");
		/*
		1) > : ū��?
		2) >=: ũ�ų� ������?
		3) < : ������?
		4) <=: �۰ų� ������?
		5) ==: ������?
		6) !=: �ٸ���?
		*/
		int a=10;
		float b=20.0f;
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		/* � ������(==)��
		   �⺻ �ڷ������� ���Ǹ� ���� �������� ���� ������ true, �ٸ��� false
		   ���� �������� ���Ǹ� ����Ű�� �ּҰ��� �������� ���´�.
		*/
		String s1=new String("Hello");
		String s2=new String("Hello");
		String s3=s1;
		System.out.println("s1==s2: "+(s1==s2));
		System.out.println("s1==s3: "+(s1==s3));

		System.out.println("4. ��Ʈ ������----");
		/* ��Ʈ�� �ٲپ� �������Ѵ�.
			1) & (And����) : �� ��Ʈ�� 1�� ��츸 1. �������� 0
			2) | (Or����)  : �� ��Ʈ �� 1���� 1�̸� 1.
			3) ^ (Xor����) : �� ��Ʈ�� ���� �ٸ��� 1, ������ 0
			------------------------------
			x   y	 &		|	 ^
			------------------------------
			1	1	 1		1	 0
			1	0	 0		1	 1
			0	1	 0		1	 1
			0	0	 0		0	 0
		
		*/
		int m=3;
		int n=5;
		System.out.println("m&n="+(m&n)); // 0001 = 1
		System.out.println("m|n="+(m|n)); // 0111 = 7
		System.out.println("m^n="+(m^n)); // 0110 = 6

		System.out.println("5. ���� ������(&, |, &&, ||)--");
		/*
		1) & : �� �����ڰ� �Ѵ� true�� ��츸 true
		2) | : �� ������ �� �ϳ��� true�� true

		3) &&: ���� �������� ����� �� �� ���� ���, ���� ������ �������� ����.
			   �� ���� �������� false�̸� ���� ������ �����Ѵ�.
		4) ||: ���� ���� �������� �� ��� ���� ������ �������� ����.
			   ���� ���� ����� true�̸� ���� ������ ������
		*/
		int x=1;
		int y=x++; //y=1, x=2
		if((x>0) & (y==1))
			System.out.println("Hello");
		else
			System.out.println("Java");


		//[����1] �Ʒ� ������ ����� �����ϼ���
		int i=1;
		int j=i++;
		if ((i>++j) && (i++ ==j));
		   //2 > 2      
		   //false

		System.out.println("i="+i); // false

		//[����2]
		int mm=0;
		int nn=1;
		if ((mm++ ==0)|(nn++ ==2))
			mm=42;
		System.out.println("mm="+mm + ", nn="+nn);

		//[����3]
		boolean r=false;
		boolean e=true;
		boolean w=((r=true)||(e=false));
		System.out.println(r + ", " + e + ", " + w);

	}
}