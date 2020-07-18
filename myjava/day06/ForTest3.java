class ForTest3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");


		for(int k=1;k<=3;k++){//행의 조건
			for (int i=1;i<=5 ;i++ )//열의 조건
			{
				System.out.print("*");
			}
			System.out.println();
			}
			System.out.println("중첩 for루프~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	for (int i=1;i<4 ;i++ )
	{
		for (int k=0;k<2 ;k++ )
		{
			System.out.println("i="+i+", k="+k);
		}
			System.out.println("********");
	}
	char ch='A';
	//중첩 for루프를 이용해서 아래와 같은 형태로 출력 하세요
	/* 
		A B C D E
		F G H I J
		K L M O P
		Q R S T U
*/

for (int i=1;i<=4 ;i++ )//  <- 갯수만 잘 맞춰주면 됨
{
	for (int k=1;k<=5 ;k++ )
	{
		System.out.print(++ch);
	}
	System.out.println();
}
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
/* 중첨 for루프를 이용해서 아래와 같이 출력 하세요.
[문제2]
*     1
**    5,6
***   9,10,11
****  13,14,15,16
*/


for (int i=1;i<=4 ;i++ )
	{
		for (int k=1;k<=4 ;k++ )
		{
			if(i>=k)
				System.out.print("*");

			}
			System.out.println();
		}
			
	
		


/*
[문제3]
    *
   **
  ***
 ****
 */
for (int i=1;i<=4 ;i++ )
	{
		for (int k=1;k<=4 ;k++ )
		{
			if(i+k>=5)
				System.out.print("*");
			else
				System.out.print(" ");
		}System.out.println();
	}



 /*[문제4]
     *
	***
   *****
*/

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
for (int i=1;i<=3 ;i++ ){
	for (int k=1;k<=5 ;k++ )
	 {
		if(i+k>=4 && k-i<=2)
			System.out.print("*");
		else		
			System.out.print(" ");
	 } 
	
	System.out.println();
}



	
	
	}
}
