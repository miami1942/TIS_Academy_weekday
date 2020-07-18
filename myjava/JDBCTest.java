class JDBCTest 
{
	public static void main(String[] args) 
	{
		try{
		//오라클 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loading Success!!");
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
}
