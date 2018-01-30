package admin;

public class Seance {
   private int Id_seance;
   private String Nom_seance;
   private String Date_seance;
   private int Id_semestre;
   
public Seance() {
	super();
	// TODO Auto-generated constructor stub
}

public Seance(String nom_seance, String date_seance, int id_semestre) {
	super();
	Nom_seance = nom_seance;
	Date_seance = date_seance;
	Id_semestre = id_semestre;
}

public int getId_seance() {
	return Id_seance;
}

public void setId_seance(int id_seance) {
	Id_seance = id_seance;
}

public String getNom_seance() {
	return Nom_seance;
}

public void setNom_seance(String nom_seance) {
	Nom_seance = nom_seance;
}

public String getDate_seance() {
	return Date_seance;
}

public void setDate_seance(String date_seance) {
	Date_seance = date_seance;
}

public int getId_semestre() {
	return Id_semestre;
}

public void setId_semestre(int id_semestre) {
	Id_semestre = id_semestre;
}


   

}
