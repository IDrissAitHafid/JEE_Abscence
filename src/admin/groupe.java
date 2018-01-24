package admin;

import java.io.Serializable;

public class groupe implements Serializable {
	private int id_groupe;
	private String Nom_groupe;
	private String UE;
	public groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public groupe(String nom_groupe, String uE) {
		super();
		Nom_groupe = nom_groupe;
		UE = uE;
	}
	
	public int getId_groupe() {
		return id_groupe;
	}

	public void setId_groupe(int id_groupe) {
		this.id_groupe = id_groupe;
	}

	public String getNom_groupe() {
		return Nom_groupe;
	}
	public void setNom_groupe(String nom_groupe) {
		Nom_groupe = nom_groupe;
	}
	public String getUE() {
		return UE;
	}
	public void setUE(String uE) {
		UE = uE;
	}

	@Override
	public String toString() {
		return "groupe [id_groupe=" + id_groupe + ", Nom_groupe=" + Nom_groupe
				+ ", UE=" + UE + "]";
	}
	
}
