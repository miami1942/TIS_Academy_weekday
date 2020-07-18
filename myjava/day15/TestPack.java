//import pack.my1;
//import pack.my2;
import pack.*;
import pack.demo.Demo; //sub패키지도 import해야 함 => 닫혀있는 상자를 열어주는 느낌
public class TestPack
{
	public static void main(String[] args) 
	{
		//my1,my2객체 생성해서 sub1(),sub2()호출하기
		my1 m1=new my1();
		m1.sub1();
		my2 m2=new my2(); //
		m2.sub2();
//		Demo객체 생성해서 bar()호출하기.
		Demo dm=new Demo();
		dm.bar();
	}
}
