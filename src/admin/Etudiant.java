package admin;

public class Etudiant {
	private int Id_etudiant;
	private String Nom_etudiant;
	private String Prenom_etudiant;
	private String Date;
	private String Id_groupe;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nom_etudiant, String prenom_etudiant, String date,
			String id_groupe) {
		super();
		Nom_etudiant = nom_etudiant;
		Prenom_etudiant = prenom_etudiant;
		Date = date;
		Id_groupe = id_groupe;
	}
	public int getId_etudiant() {
		return Id_etudiant;
	}
	public void setId_etudiant(int id_etudiant) {
		Id_etudiant = id_etudiant;
	}
	public String getNom_etudiant() {
		return Nom_etudiant;
	}
	public void setNom_etudiant(String nom_etudiant) {
		Nom_etudiant = nom_etudiant;
	}
	public String getPrenom_etudiant() {
		return Prenom_etudiant;
	}
	public void setPrenom_etudiant(String prenom_etudiant) {
		Prenom_etudiant = prenom_etudiant;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getId_groupe() {
		return Id_groupe;
	}
	public void setId_groupe(String id_groupe) {
		Id_groupe = id_groupe;
	}
	
	
	
}
