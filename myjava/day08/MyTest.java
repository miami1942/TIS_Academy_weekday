class MyTest
{
	//�Ű������� �޾Ƶ��̴� �޼ҵ�
	//�Ű�����=> argemaent, parameter(���������� ����)
	public static int star(int num){
		for (int i=0;i<=num ;i++ ){
			System.out.print("��");
		}
		System.out.println();
		return num*2;
		

	}//---------------------------------------------------------------------
	
	public void sharp(float n){
		for (int i=1;i<=n ;i++ ){
			System.out.print("#");
		}
		System.out.println();
	}//-----------------------------------------------------------


	public static void main(String[] args) 
	{
		System.out.println(MyTest.star(4));//�ڡڡڡ�
										   //8
		//star()�޼ҵ� ȣ���ϱ�
		int star=MyTest.star(5);
		System.out.println(star);

		//sharp()�޼ҵ� ȣ���ϱ�
		MyTest mt=new MyTest();
		mt.sharp(6);
	}
}