package yourPack;

import myPack.*;
/*�ڹ��� ���� ������(access modifier)
	1) public   : ��𼭵� ���� ����
	2) protected: ���� ��Ű���� ���� �ٸ� ��Ű��������� �θ� �ڽ��� ��� ������ ���
				  ���� ����.
	3) ������		: ������Ű�� ���� �ִ� Ŭ�����鳢�� ���ٰ���.
		(����Ű�� ������, ����Ʈ ������)
	4) private	: �ڱ� Ŭ���� �������� ���� ����*/

public class FFF
{
	public static void main(String[] args) 
	{
		AAA a=new AAA();//public class: ��𼭵� ���ٰ���
		//BBB b=new BBB();//������ class : ������Ű�� �������� ���ٰ���.
		//b.foo();
		CCC c=new CCC();//public
		c.sub();
	}
}
