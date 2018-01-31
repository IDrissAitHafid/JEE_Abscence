package admin;

public class Utilisateur {
  private String Nom_utilisateur;
  private String Prenom_utilisateur;
  private String password;
public String getNom_utilisateur() {
	return Nom_utilisateur;
}
public void setNom_utilisateur(String nom_utilisateur) {
	Nom_utilisateur = nom_utilisateur;
}
public String getPrenom_utilisateur() {
	return Prenom_utilisateur;
}
public void setPrenom_utilisateur(String prenom_utilisateur) {
	Prenom_utilisateur = prenom_utilisateur;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
}
