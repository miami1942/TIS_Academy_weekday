public class UnaryOperator
{
	public static void main(String[] args) 
	{
		System.out.println("1. 부호연산자 (+,-)----");
		byte a=5;
		short b=(short)-a;
		System.out.println(+a);
		System.out.println(+b); // -5
		System.out.println(-b); // 5
		
		System.out.println("2. 증감 연산자(++,--)");
		int c=7;
		long d=4;
		c++; // c=c+1; 1씩 증가시킴
		d--; // d=d-1; 1씩 감소시킴
		System.out.println("c="+c);
		System.out.println("d="+d);
		++c;
		--d;
		System.out.println("c="+c);
		System.out.println("d="+d);

		float e=8.6f;
		double f=9.7;
		System.out.println(++e);
		System.out.println(e++); //++이 변수 뒤에 왔기때문임(출력문에 오면 자기자신을 출력문에 먼저쓰기때문에
													//증가가 되지않는것임 <- '--'도 마찬가지
		System.out.println("e:"+e);
		System.out.println(f--);
		System.out.println("f:"+f);

		int x=10;
		int y=x++; // x는 11로 먼저 올라가고 ++이 뒤에있기때문에 와이는 x값을 먼저 대입을해서 10이 나옴
		System.out.println("x: "+x); //11
		System.out.println("y: "+y); //10

		x=10;
		int z=++x;
		System.out.println("x: "+x);
		System.out.println("z: "+z);

		System.out.println("3. 비트별 not 연산자(~)----");
		//비트 반전. 0은 1로, 1은 0으로 변환한다.
		int m=42;
		int n=~m;
		/*
		먼저 42를 비트로 바꿔 보세요 (2진수)
		   42: 00000000 00000000 00000000 00101010
		  ~42: 11111111 11111111 11111111 11010101
		     (-1 * 2^31) + (1 * 2^30) + 1 * 2^29)....
			 1이 끝나는 지점 까지 전부 삭제하고 
		*/ 
		System.out.println("m="+m);
		System.out.println("n="+n);

		//문제
		int w=0xfffffff1; // 16진수임 -> f(15)하나만 2진수로 바꿧을때 1111로 나옴
		//1111 1111 1111 1111 1111 1111 1111 0001
		//(비트란 띄워쓰기들 사이에 숫자들 갯수  ex) 1111   <- 4비트)
		//첫비트의 숫자를 10진수로 바꿀땐 첫비트의 숫자를 제외한 숫자를 ^0 <- '승'으로 올리면 됨
		System.out.println("w: "+w); // -15
		System.out.println("~w: "+(~w)); //14
		// 0000 0000 0000 0000 0000 0000 0000 1110

		System.out.println("4. 논리 부정 연산자(!)--------");
		//논리식이나 논리값에서만 사용 가능
		// true는 false로, false는 true로 바꿔준다.
		boolean bool=false;
		System.out.println("bool="+bool);
		System.out.println("!bool="+(!bool));
		System.out.println(!(10>3));

		int yy=3;
		double p=3.1;
		System.out.println(yy==p); // yy와 p의 값이 같은지 비교함
		System.out.println(yy!=p); // yy와 p의 값이 다르면 true

	}
}
