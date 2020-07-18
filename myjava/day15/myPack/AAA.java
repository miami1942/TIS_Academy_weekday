package myPack;
//패키지 선언문. 최상단에 와야함.
//패키지명과 디렉토리명이 같아야 한다. 대소문자도 같아야 함.

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
