package admin.web;

import java.util.ArrayList;
import java.util.List;

import admin.Etudiant;

public class EtudiantModel {
	private String motCleEt;
	private String grpe;
	private String snce;
	private List<Etudiant> etudiants=new ArrayList<Etudiant>();
	private Etudiant etudiant;
	

	public String getGrpe() {
		return grpe;
	}

	public void setGrpe(String grpe) {
		this.grpe = grpe;
	}

	public String getSnce() {
		return snce;
	}

	public void setSnce(String snce) {
		this.snce = snce;
	}	

	public String getMotCleEt() {
		return motCleEt;
	}
	
	public void setMotCleEt(String motCleEt) {
		this.motCleEt = motCleEt;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	
	
	
}
