class Foop 
{
	static int b=1;
		   int a=0;

	public double aaa(){
		System.out.print("abdcde\ndouble ���� = ");
		
		return 5.654;
		//	   �� �䰪�� ���� public float aaa(){ ���� 'float'���� ���ƾ���. <- �� 'float'�� ���� ���簣��
	}
	public static void ccc(){
		System.out.println("ccc�� ��� ��µǴ°�.");
		
	}

	public static String ddd(){
		System.out.println("bbb");
		System.out.println("asdf");
		return "���ϰ��� ���ô�";
	}
	public static void main(String[] args){ //void�� return���� �ʴ´�.
		Foop.ccc();
		String str=Foop.ddd();
		System.out.println(str);




		
		//System.out.println(Foo.b);
		//String asd=Foo.ddd();
		//System.out.println(fuck.a);
		//System.out.println(Foo.ddd());
		
		
		
	}
}
