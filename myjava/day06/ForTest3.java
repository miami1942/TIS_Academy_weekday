class ForTest3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");


		for(int k=1;k<=3;k++){//���� ����
			for (int i=1;i<=5 ;i++ )//���� ����
			{
				System.out.print("*");
			}
			System.out.println();
			}
			System.out.println("��ø for����~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	for (int i=1;i<4 ;i++ )
	{
		for (int k=0;k<2 ;k++ )
		{
			System.out.println("i="+i+", k="+k);
		}
			System.out.println("********");
	}
	char ch='A';
	//��ø for������ �̿��ؼ� �Ʒ��� ���� ���·� ��� �ϼ���
	/* 
		A B C D E
		F G H I J
		K L M O P
		Q R S T U
*/

for (int i=1;i<=4 ;i++ )//  <- ������ �� �����ָ� ��
{
	for (int k=1;k<=5 ;k++ )
	{
		System.out.print(++ch);
	}
	System.out.println();
}
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
/* ��÷ for������ �̿��ؼ� �Ʒ��� ���� ��� �ϼ���.
[����2]
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
[����3]
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



 /*[����4]
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
