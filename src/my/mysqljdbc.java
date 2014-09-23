package my;

import java.sql.*;

public class mysqljdbc {

	public static void main(String args[]) {
		
		try { 
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序     
			//Class.forName("org.gjt.mm.mysql.Driver");  
			System.out.println("Success loading Mysql Driver!");    
			}    
		catch (Exception e) { 
			System.out.print("Error loading Mysql Driver!");     
			e.printStackTrace();    }    
		
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","fenglhs","1216810");        
			//连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码    
		
			int num=100;   
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO user VALUES(?,?)"); 
			for(int i=0;i<num;i++)        //定义个100次的循环，往表里插入一百条信息。 
			{      
				Statement.setString(1,"chongshi"+i);    
				Statement.setString(2,"bo"+i);      
				Statement.executeUpdate();   
			}
		
		
		
		}
		
		catch(SQLException e) 
		{
			
		}
	
	}

}
	
