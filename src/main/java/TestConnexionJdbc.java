import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnexionJdbc {
	private static String DB_URL= "jdbc:mariadb://localhost:3306/compta";
	private static String DB_LOGIN= "root";
	private static String DB_PWD= "elisa";
	
	
	
	public static void main(String[] args) throws SQLException{
		
		ResourceBundle props= ResourceBundle.getBundle("db");
		String url= props.getString("jdbc.url");
		String user= props.getString("jdbc.user");
		String pass= props.getString("jdbc.password");
		java.sql.Connection connect= DriverManager.getConnection(url, user, pass);	
			
		System.out.println(connect);
			
		connect.close();	
		
	}

}
