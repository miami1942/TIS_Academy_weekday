class HisDemo{
	private float var=3.45f;	//인스턴스 변수 => set%$#=같은클래스 내에서 하는것임/get은 메인에서 안됨
	static char ch='Q'; //클래스 변수 (static이 붙으면 메모리에 먼저올라가)
	public static void main(String[] args)
	{
		
		//[1]변수 var와 ch값을 출력하세요.


		HisDemo hd=new HisDemo();//객체생성
			  //↑객체명
		System.out.println("var="+hd.var);//객체명.변수
		
		System.out.println("ch="+HisDemo.ch); //클래스변수 ch 출력

		//[2] HerDemo의 str과 info값을 출력하세요
		System.out.println("info="+HerDemo.info);//클래스변수 (클래스.변수)
		HerDemo rd=new HerDemo();//객체생성
		System.out.println("str="+rd.str);
		
	}
}////////////////////////////
