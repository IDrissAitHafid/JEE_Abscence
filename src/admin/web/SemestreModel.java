package admin.web;

import java.util.ArrayList;
import java.util.List;

import admin.Semestre;



public class SemestreModel {
	private List<Semestre> semestres=new ArrayList<Semestre>();

	public List<Semestre> getSemestres() {
		return semestres;
	}

	public void setSemestres(List<Semestre> semestres) {
		this.semestres = semestres;
	}
	
}
