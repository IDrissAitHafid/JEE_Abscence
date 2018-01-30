package admin.web;

import java.util.ArrayList;
import java.util.List;

import admin.Etudiant;

public class EtudiantModel {
	private int motCleEt;
	private List<Etudiant> etudiants=new ArrayList<Etudiant>();
	
	public int getMotCleEt() {
		return motCleEt;
	}
	public void setMotCleEt(int motCleEt) {
		this.motCleEt = motCleEt;
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	
}
