package admin.web;

import java.util.ArrayList;
import java.util.List;
import admin.Seance;

public class SeanceModel {
	private List<Seance> seances=new ArrayList<Seance>();

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
}
