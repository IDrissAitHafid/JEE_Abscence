package admin;

import java.util.List;

public interface ISeance {
	public List<Seance> Afficher_seance();

	public Seance getSeance(String nomSnce);
}
