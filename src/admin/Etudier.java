package admin;

public class Etudier {
	private String Absence_etudiant;
	//private int Id_seance;
	private String Nom_seance;
    private int Id_etudiant;
	public Etudier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudier(String absence_etudiant, String nom_seance, int id_etudiant) {
		super();
		Absence_etudiant = absence_etudiant;
		Nom_seance = nom_seance;
		Id_etudiant = id_etudiant;
	}
	public String getAbsence_etudiant() {
		return Absence_etudiant;
	}
	public void setAbsence_etudiant(String absence_etudiant) {
		Absence_etudiant = absence_etudiant;
	}
	
	public String getNom_seance() {
		return Nom_seance;
	}
	public void setNom_seance(String nom_seance) {
		Nom_seance = nom_seance;
	}
	public int getId_etudiant() {
		return Id_etudiant;
	}
	public void setId_etudiant(int id_etudiant) {
		Id_etudiant = id_etudiant;
	}
	
}
