import java.io.IOException;

public class IfTest3
{
	public static void main(String[] args) 
		throws IOException
	{
		System.out.println("0~9 사이의 정수 또는 문자를 입력하세요 =>");
		char input=(char)System.in.read();
		System.out.println("input="+input);

		/*[문제] 입력받은 값이 0~9사이 값이면 "숫자이군요",
				꼬는 알파벳 대문자이거나 소문자이면 "알파벳입니다".
				그외 문자이면 "기타 문자입니다"를 출력하세요*/
				if (input>='0' && input<='9')//지금 아스키코드로 되어 있음 위에 보면 됨 (여긴 char로 해야됨)
				//아니면 ''를 붙여서 문자화 시킨다.
					System.out.println(input + "은 숫자입니다.");
				else if((input>='A' && input<='Z')||(input>='a' && input<='z'))
					// '&&' 연산과 '||' 연산중에 '&&'연산의 우선순위가 더 높다.
					System.out.println(input + "은 문자입니다");
				else
					System.out.println(input + "은 기타문자입니다.");


	}
}
