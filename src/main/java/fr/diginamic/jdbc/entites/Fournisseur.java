package fr.diginamic.jdbc.entites;

public class Fournisseur {
	
	private String id;
	private String nom;
	public Fournisseur(String id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		
		return id+" "+nom;
	}

}
