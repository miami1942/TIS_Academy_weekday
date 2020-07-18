public class Variable
// ↑파일이름과 동일하게
{
	//public : 접근지정자(access modifier)
	//static : modifier
	//void : 메소드의 반환타입이 없을경우 void로 지정한다.
	//(String[] args) : 매개변수 args => 자료유형은 String타입의 배열
	public static void main(String[] args)
		//public과 static은 바뀌어도 상관음슴
		//[]는 배열을 의미함
	{
		System.out.println("변수");
		int myNum=100; //변수는 소문자로 시작. 명사형으로 짓는다.
		    //↑카멜표기법(낙타표기법이라고)
		int your_num=200;
		System.out.println(myNum);
		System.out.println(your_num);
		System.out.println(myNum+your_num);//300
		System.out.println(myNum*your_num);//20000

		int radius=5;
		double pi=3.14;
		//위 변수를 이용해서 반지름이 5인 원의 면적을 출력해보세요
		System.out.println(radius*radius*pi);
		
		//변수: variable, field, property, argment(매개변수)
		//자로형 변수명 ; 변수선언
		int a=-10;//변수 선언과 동시에 초기값을 부여
		double b;//변수 선언
		b=20.12;//초기화
		System.out.println("a="+a);
		System.out.println("b="+b);
		//문자열 + 변수 => 문자열 결합이 일어남

		String str="안녕?";
		System.out.println("str="+str);
	}


}