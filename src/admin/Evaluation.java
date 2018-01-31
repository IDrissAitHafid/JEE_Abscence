package admin;

public class Evaluation {
 private int Id_evaluation;
 private double Note;
 private int Id_professeur;
public Evaluation() {
	super();
	// TODO Auto-generated constructor stub
}
public Evaluation(double note, int id_professeur) {
	super();
	Note = note;
	Id_professeur = id_professeur;
}
public int getId_evaluation() {
	return Id_evaluation;
}
public void setId_evaluation(int id_evaluation) {
	Id_evaluation = id_evaluation;
}
public double getNote() {
	return Note;
}
public void setNote(double note) {
	Note = note;
}
public int getId_professeur() {
	return Id_professeur;
}
public void setId_professeur(int id_professeur) {
	Id_professeur = id_professeur;
}
 
}
