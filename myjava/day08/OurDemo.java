class OurDemo
{
	/*2. ��� �޼ҵ�
		 1) static�� �޼ҵ� ===> Ŭ���� �޼ҵ�  =>"Ŭ������.�޼ҵ��()"
		 2) non-static �޼ҵ�==> �ν��Ͻ� �޼ҵ�=>"��ü��.�޼ҵ��()"
	*/
	public static void showStar(){
		System.out.println("�ڡڡڡ�");
	}
	public void showCircle(){
		System.out.println("�ۡۡۡۡ�");
	}
	public static void main(String[] args) 
	{
		YourDomo yd=new YourDomo();
		System.out.println(YourDomo.c);
		
		/*
		//showStar()�޼ҵ带 ȣ���ϼ���
		System.out.println("Hello World!");
		OurDemo.showStar();
			
		//showCircle() ȣ���ϱ�
		OurDemo od=new OurDemo();
		od.showCircle();

		//Foo Ŭ������ aaa()�޼ҵ带 ȣ���ϼ���
		
		
		//FooŬ������ bbb()�޼ҵ带 ȣ���ϼ���
		Foo.bbb();
		Foo f=new Foo();*/
	 /* System.out.println(f.aaa());  <= �޼ҵ��� �ֵ��� ��¹��� ���ϼ�����*/
		/*f.aaa();
		f.bbb(); //������ �ϳ� �����ϴ� ����� �ƴ�.*/
	}
}
