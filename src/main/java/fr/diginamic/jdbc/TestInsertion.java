package fr.diginamic.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.beans.Statement;
import java.sql.Connection;

public class TestInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle props= ResourceBundle.getBundle("db");
		String url= props.getString("jdbc.url");
		String user= props.getString("jdbc.user");
		String pass= props.getString("jdbc.password");
		
		try(java.sql.Connection connect= DriverManager.getConnection(url, user, pass)){
			
			java.sql.Statement state= connect.createStatement();
			
			int resultat= state.executeUpdate("INSERT INTO fournisseur (nom) VALUES ('La Maison de la Peinture')");
			
			System.out.println(resultat);
			
			
			
		}catch(SQLException e) {
			
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		
	}

}
