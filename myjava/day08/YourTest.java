class YourTest 
{
	//��ȯŸ���� �ִ� �޼ҵ� => �޼ҵ� ���������� return������ �ۼ��ؾ� ��
	//					   ���� ��ȯŸ�Կ� �ش��ϴ� ���� return �ؾ��Ѵ�.
	public static int giveMe(int money){
		System.out.println("���ڱ�: "+money+"����");

		return money*2;
	}

	public String giveToUpper(String str){
		System.out.println("str: "+str);
		return str.toUpperCase();//(non-static)�빮�ڷ� �������� 
	}
	public static void main(String[] args) 
	{
		YourDomo yd=new YourDomo();
		yd.a(5);//4

		System.out.println(yd.b(8));

		YourDomo.c(5);//5

		//giveMe()�޼ҵ带 ȣ���ϼ���
		System.out.println("Hello World!");
		int m=YourTest.giveMe(100);
		System.out.println("��ȯ��: "+m+"����");

		System.out.println("----------------------------------------------");

		YourTest yt=new YourTest();
		String d=yt.giveToUpper("hello Java");
		System.out.println("�޾ƾߵ�: "+d);


	}
}