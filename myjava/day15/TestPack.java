//import pack.my1;
//import pack.my2;
import pack.*;
import pack.demo.Demo; //sub��Ű���� import�ؾ� �� => �����ִ� ���ڸ� �����ִ� ����
public class TestPack
{
	public static void main(String[] args) 
	{
		//my1,my2��ü �����ؼ� sub1(),sub2()ȣ���ϱ�
		my1 m1=new my1();
		m1.sub1();
		my2 m2=new my2(); //
		m2.sub2();
//		Demo��ü �����ؼ� bar()ȣ���ϱ�.
		Demo dm=new Demo();
		dm.bar();
	}
}
