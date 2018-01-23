package admin;

import java.io.Serializable;

public class Professeur implements Serializable {
	private int Id_professeur;
	private String Nom_professeur;
	private String Prenom_professeur;
	private String Email;
	private String Numero_Telephone;
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professeur(String nom_professeur, String prenom_professeur, String email, String numero_Telephone) {
		super();
		Nom_professeur = nom_professeur;
		Prenom_professeur = prenom_professeur;
		Email = email;
		Numero_Telephone = numero_Telephone;
	}
	public int getId_professeur() {
		return Id_professeur;
	}
	public void setId_professeur(int id_professeur) {
		Id_professeur = id_professeur;
	}
	
	public String getNom_professeur() {
		return Nom_professeur;
	}
	public void setNom_professeur(String nom_professeur) {
		Nom_professeur = nom_professeur;
	}
	public String getPrenom_professeur() {
		return Prenom_professeur;
	}
	public void setPrenom_professeur(String prenom_professeur) {
		Prenom_professeur = prenom_professeur;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNumero_Telephone() {
		return Numero_Telephone;
	}
	public void setNumero_Telephone(String numero_Telephone) {
		Numero_Telephone = numero_Telephone;
	}
	@Override
	public String toString() {
		return "Professeur [Id_professeur=" + Id_professeur + ", Nom_professeur=" + Nom_professeur
				+ ", Prenom_professeur=" + Prenom_professeur + ", Email=" + Email + ", Numero_Telephone="
				+ Numero_Telephone + "]";
	}
	

}
