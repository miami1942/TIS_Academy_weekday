class HisDemo{
	private float var=3.45f;	//�ν��Ͻ� ���� => set%$#=����Ŭ���� ������ �ϴ°���/get�� ���ο��� �ȵ�
	static char ch='Q'; //Ŭ���� ���� (static�� ������ �޸𸮿� �����ö�)
	public static void main(String[] args)
	{
		
		//[1]���� var�� ch���� ����ϼ���.


		HisDemo hd=new HisDemo();//��ü����
			  //�谴ü��
		System.out.println("var="+hd.var);//��ü��.����
		
		System.out.println("ch="+HisDemo.ch); //Ŭ�������� ch ���

		//[2] HerDemo�� str�� info���� ����ϼ���
		System.out.println("info="+HerDemo.info);//Ŭ�������� (Ŭ����.����)
		HerDemo rd=new HerDemo();//��ü����
		System.out.println("str="+rd.str);
		
	}
}////////////////////////////
