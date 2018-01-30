package admin;

public class Semestre {
	private int Id_semestre;
	private String Nom_semestre;
	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Semestre(String nom_semestre) {
		super();
		Nom_semestre = nom_semestre;
	}
	public int getId_semestre() {
		return Id_semestre;
	}
	public void setId_semestre(int id_semestre) {
		Id_semestre = id_semestre;
	}
	public String getNom_semestre() {
		return Nom_semestre;
	}
	public void setNom_semestre(String nom_semestre) {
		Nom_semestre = nom_semestre;
	}
	

}
