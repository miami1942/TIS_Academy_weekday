class MyDomo
{
		   int b=20;//전역변수 인스턴스변수=> "객체명.변수"식으로 접근해야힘
	static int c=30;//전역변수 클래스 변수=>"클래스명.변수"로 접근

	public static void main(String[] args) 
	{
	    int a=10;//지역변수(local variable)
		System.out.println("a="+a);
		//System.out.println(MyDemo.b="b);
		//c의 값을 출력 해보세요.
		System.out.println("c="+c);//이클립스에서는 노란색 경고가 뜸.
		System.out.println("MyDemo.c="+MyDomo.c);
		System.out.println(YourDomo.c);
		MyDomo md=new MyDomo();//객체생성
		//Heap메모리 영역에 MyDomo객체가 올라감
		//md ==> 객체를 참조하는 이름(객체명)
		System.out.println("md.b="+md.b);
	  
	  
	}
}
