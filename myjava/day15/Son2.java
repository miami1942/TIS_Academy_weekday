package windows.java;

import linux.java.*; //<-Parent ������ ���� linux�� �ֱ⶧���� import�� ���־�� ���� ����.

public class Son2 extends /*linux.java.*/Parent // �̰�쿡�� 1ȸ������ ����쿡
{
	public void go(){
		System.out.println("publicVar="+publicVar);
		System.out.println("protectedVar="+protectedVar);
	//	System.out.println("defaultVar="+defaultVar);
		//System.out.println("privateVar="+privateVar);
		//set,get ����� �����ؾ� �������� ��� ����.
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//go()ȣ���ϱ�
		Son2 s=new Son2();
		s.go();


	}
}