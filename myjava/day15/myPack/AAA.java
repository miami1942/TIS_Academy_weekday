package myPack;
//��Ű�� ����. �ֻ�ܿ� �;���.
//��Ű����� ���丮���� ���ƾ� �Ѵ�. ��ҹ��ڵ� ���ƾ� ��.

public class AAA
{
	public static void main(String[] args) 
	{
		System.out.println("AAA");
		BBB b=new BBB();
		b.foo();
		CCC c=new CCC();
		c.sub();
		DDD d=new DDD();
		d.bar();
	}
}////////////////////////////////////////////////////////////////
class BBB{
	public void foo(){
		System.out.println("BBB");
	}

}///////////////////////////////////////////////////////////////
