import java.util.Date;

public class ReferenceType
{
	public static void main(String[] args) 
	{
		/*
		1. 기본자료형(Primitive type)
		2. 참조형 (Reference type) => 클래스형, 인터페이스형, 배열
			=> 참조유형은 객체를 변수가 가리키는 유형을 의미
			   참조유형은 직접 값을 할당해서는 안되고 반드시
			   new라는 연산자를 이용해서 객체를 생성하여야 한다.
			   단, 예외가 있다. String의 경우 new해도 되지만
			   값을 직접 할당해도 된다.
		*/
		Date today=new Date(); //참조형
		int num=100;//기본자료형
		Object obj=new Object();
		System.out.println(today);
		System.out.println(num);
		System.out.println(obj);

		String str=new String("Hello");
		System.out.println(str);
		String str2="Hello";
		System.out.println(str2);

		int m=20;
		int n=30;
		System.out.println("합=>"+m+n);
		System.out.println("합=>"+(m+n));
		System.out.println(m+n+"<=합");


	}
}
