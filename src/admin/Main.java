package admin;

public class Main {

	public static void main(String[] args) {
	/*ProfesseurImp prof=new ProfesseurImp();
	Professeur prof1=prof.Ajouter_prof(new Professeur("AIT HAFID","IDRISS","aithafid.idriss@gmail.com","+2126352145"));
    System.out.println(prof1.toString());*/
    
    ImplGroupeDao grp=new ImplGroupeDao();
    groupe grp1=grp.saveGroupe(new groupe("GL2", "IDK2"));
    System.out.println(grp1);
	}

}
