package admin;

public interface IProfesseur {
	public Professeur Ajouter_prof(Professeur p);
	public Professeur Modifier_prof(Professeur p);
	public Professeur Supprimer_prof(int Id_professeur);
	public Professeur Consulter_prof(int Id_professeur);

}
