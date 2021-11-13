package fr.diginamic.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResourceBundle props= ResourceBundle.getBundle("db");
		String url= props.getString("jdbc.url");
		String user= props.getString("jdbc.user");
		String pass= props.getString("jdbc.password");
		
		try(java.sql.Connection connect= DriverManager.getConnection(url, user, pass)){
			
			java.sql.Statement state= connect.createStatement();
			
			int resultat= state.executeUpdate("UPDATE fournisseur SET nom='Dupont' WHERE ID=5");
			
			System.out.println(resultat);
			
			
			
		}catch(SQLException e) {
			
			
			System.out.println(e.getMessage());
			
		}

	}

}
