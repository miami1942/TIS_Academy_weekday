import javax.swing.JOptionPane;

class Wrapper2
{
	public static void main(String[] args) 
	{
		String str=JOptionPane.showInputDialog("정수1를 입력하세요");
		System.out.println("str: "+str);

		String str2=JOptionPane.showInputDialog("정수2를 입력하세요");
		System.out.println("str2: "+str2);

		//두 정수 값의 합을 구해 출력하세요.
		System.out.println(str+"+"+str2);

		int a=Integer.parseInt(str);
		int b=Integer.parseInt(str2);
		System.out.println("두값의 합 = "+(a+b));
		//덧셈식과 결과값 출력하기
		System.out.println(a+" x "+b+" = "+(a*b));

	}
}
