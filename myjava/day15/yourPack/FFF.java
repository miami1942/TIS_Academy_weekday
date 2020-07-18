package yourPack;

import myPack.*;
/*자바의 접근 지정자(access modifier)
	1) public   : 어디서든 접근 가능
	2) protected: 같은 패키지는 물론 다른 패키지일지라고 부모 자식의 상속 관계인 경우
				  접근 가능.
	3) 생략형		: 같은패키지 내에 있는 클래스들끼리 접근가능.
		(↑패키지 지정자, 디폴트 지정자)
	4) private	: 자기 클래스 내에서만 접근 가능*/

public class FFF
{
	public static void main(String[] args) 
	{
		AAA a=new AAA();//public class: 어디서든 접근가능
		//BBB b=new BBB();//생략형 class : 같은패키지 내에서만 접근가능.
		//b.foo();
		CCC c=new CCC();//public
		c.sub();
	}
}
