class JDBCTest 
{
	public static void main(String[] args) 
	{
		try{
		//����Ŭ ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loading Success!!");
		}catch(ClassNotFoundException e){
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}
}
