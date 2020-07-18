public class UnaryOperator
{
	public static void main(String[] args) 
	{
		System.out.println("1. ��ȣ������ (+,-)----");
		byte a=5;
		short b=(short)-a;
		System.out.println(+a);
		System.out.println(+b); // -5
		System.out.println(-b); // 5
		
		System.out.println("2. ���� ������(++,--)");
		int c=7;
		long d=4;
		c++; // c=c+1; 1�� ������Ŵ
		d--; // d=d-1; 1�� ���ҽ�Ŵ
		System.out.println("c="+c);
		System.out.println("d="+d);
		++c;
		--d;
		System.out.println("c="+c);
		System.out.println("d="+d);

		float e=8.6f;
		double f=9.7;
		System.out.println(++e);
		System.out.println(e++); //++�� ���� �ڿ� �Ա⶧����(��¹��� ���� �ڱ��ڽ��� ��¹��� �������⶧����
													//������ �����ʴ°��� <- '--'�� ��������
		System.out.println("e:"+e);
		System.out.println(f--);
		System.out.println("f:"+f);

		int x=10;
		int y=x++; // x�� 11�� ���� �ö󰡰� ++�� �ڿ��ֱ⶧���� ���̴� x���� ���� �������ؼ� 10�� ����
		System.out.println("x: "+x); //11
		System.out.println("y: "+y); //10

		x=10;
		int z=++x;
		System.out.println("x: "+x);
		System.out.println("z: "+z);

		System.out.println("3. ��Ʈ�� not ������(~)----");
		//��Ʈ ����. 0�� 1��, 1�� 0���� ��ȯ�Ѵ�.
		int m=42;
		int n=~m;
		/*
		���� 42�� ��Ʈ�� �ٲ� ������ (2����)
		   42: 00000000 00000000 00000000 00101010
		  ~42: 11111111 11111111 11111111 11010101
		     (-1 * 2^31) + (1 * 2^30) + 1 * 2^29)....
			 1�� ������ ���� ���� ���� �����ϰ� 
		*/ 
		System.out.println("m="+m);
		System.out.println("n="+n);

		//����
		int w=0xfffffff1; // 16������ -> f(15)�ϳ��� 2������ �مf���� 1111�� ����
		//1111 1111 1111 1111 1111 1111 1111 0001
		//(��Ʈ�� �������� ���̿� ���ڵ� ����  ex) 1111   <- 4��Ʈ)
		//ù��Ʈ�� ���ڸ� 10������ �ٲܶ� ù��Ʈ�� ���ڸ� ������ ���ڸ� ^0 <- '��'���� �ø��� ��
		System.out.println("w: "+w); // -15
		System.out.println("~w: "+(~w)); //14
		// 0000 0000 0000 0000 0000 0000 0000 1110

		System.out.println("4. ���� ���� ������(!)--------");
		//�������̳� ������������ ��� ����
		// true�� false��, false�� true�� �ٲ��ش�.
		boolean bool=false;
		System.out.println("bool="+bool);
		System.out.println("!bool="+(!bool));
		System.out.println(!(10>3));

		int yy=3;
		double p=3.1;
		System.out.println(yy==p); // yy�� p�� ���� ������ ����
		System.out.println(yy!=p); // yy�� p�� ���� �ٸ��� true

	}
}