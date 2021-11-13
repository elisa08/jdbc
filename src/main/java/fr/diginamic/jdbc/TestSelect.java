package fr.diginamic.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import fr.diginamic.jdbc.entites.Fournisseur;

public class TestSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle props= ResourceBundle.getBundle("db");
		String url= props.getString("jdbc.url");
		String user= props.getString("jdbc.user");
		String pass= props.getString("jdbc.password");
		
		List<Fournisseur> list= new ArrayList<>();
		
		
		
		try(java.sql.Connection connect= DriverManager.getConnection(url, user, pass)){
			
			java.sql.Statement state= connect.createStatement();
			
			ResultSet resultat= state.executeQuery("SELECT * FROM fournisseur");
			
			while(resultat.next()) {
				
				String nom= resultat.getString("nom");
				String id= resultat.getString("ID");
				

				Fournisseur fournisseur= new Fournisseur(id,nom);
				list.add(fournisseur);
				
			}
			
			for (Fournisseur fournisseur2 : list) {
				
				System.out.println(fournisseur2);
				
			}
			
			
			
			
		}catch(SQLException e) {
			
			
			System.out.println(e.getMessage());
			
		}

	}

}
