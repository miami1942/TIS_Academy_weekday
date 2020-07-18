class Foop 
{
	static int b=1;
		   int a=0;

	public double aaa(){
		System.out.print("abdcde\ndouble 값은 = ");
		
		return 5.654;
		//	   ↑ 요값은 위에 public float aaa(){ 에서 'float'값과 같아야함. <- 그 'float'이 뭐가 오든간에
	}
	public static void ccc(){
		System.out.println("ccc는 어떻게 출력되는가.");
		
	}

	public static String ddd(){
		System.out.println("bbb");
		System.out.println("asdf");
		return "리턴값은 요고시다";
	}
	public static void main(String[] args){ //void는 return하지 않는다.
		Foop.ccc();
		String str=Foop.ddd();
		System.out.println(str);




		
		//System.out.println(Foo.b);
		//String asd=Foo.ddd();
		//System.out.println(fuck.a);
		//System.out.println(Foo.ddd());
		
		
		
	}
}
