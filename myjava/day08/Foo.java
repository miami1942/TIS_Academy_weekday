class Foo 
{
	static int b=1;
		   int a=0;

	public double aaa(){
		System.out.print("abdcde\ndouble ���� = ");
		
		return 5.654;
		//	   �� �䰪�� ���� public float aaa(){ ���� 'float'���� ���ƾ���. <- �� 'float'�� ���� ���簣��
	}
	public static String ddd(){
		System.out.println("bbb");
		System.out.println("asdf");
		return "ghijk";
	}
	public static void main(String[] args){ //void�� return���� �ʴ´�.
		//Foo fuck=new Foo();
		System.out.println("b="+Foo.b);
		//Foo.ddd();
		//System.out.println(fuck.a);
		//System.out.println(Foo.ddd());
		//System.out.println(fuck.aaa());
		
		
	}
}