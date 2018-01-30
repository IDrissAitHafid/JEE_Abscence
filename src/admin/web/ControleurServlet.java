package admin.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import admin.IGroupeDao;
import admin.IProfesseur;
import admin.ImplGroupeDao;
import admin.Professeur;
import admin.ProfesseurImp;
import admin.groupe;

public class ControleurServlet extends HttpServlet{
	private IGroupeDao groupeMetier;
	private IProfesseur profMetier;
	@Override
	public void init() throws ServletException {
		groupeMetier=new ImplGroupeDao();
		profMetier=new ProfesseurImp();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//req.getRequestDispatcher("groupes.jsp").forward(req,resp);
		String path=req.getServletPath();
		if(path.equals("/index.do")){
			req.getRequestDispatcher("groupes.jsp").forward(req, resp);
		}
		else if(path.equals("/chercher.do")){
			String motCle=req.getParameter("motCle");
			GroupeModel model=new GroupeModel();
			model.setMotCle(motCle);
			List<groupe> groupes=groupeMetier.groupeParMC("%"+motCle+"%");
			model.setGroupes(groupes);
			req.setAttribute("model", model);
			req.getRequestDispatcher("groupes.jsp").forward(req, resp);
			
		}else if(path.equals("/saisirGrp.do")){
			req.getRequestDispatcher("ajouterGrp.jsp").forward(req, resp);
			
		}else if(path.equals("/ajouterGrp.do")&&(req.getMethod().equals("POST"))){
			String nmGrp=req.getParameter("nomGrp");
			String UE=req.getParameter("UE");
			groupe g=groupeMetier.saveGroupe(new groupe(nmGrp, UE));
			req.setAttribute("groupe", g);
			req.getRequestDispatcher("ConfirmationGrp.jsp").forward(req, resp);
		}else if(path.equals("/supprimeGrp.do")){
			int id=Integer.parseInt(req.getParameter("id"));
			groupeMetier.deteteGroupe(id);
			resp.sendRedirect("chercher.do?motCle=");
		}else if(path.equals("/editGrp.do")){
			int id=Integer.parseInt(req.getParameter("id"));
			groupe g=groupeMetier.getGroupe(id);
			req.setAttribute("groupe", g);
			req.getRequestDispatcher("editGrp.jsp").forward(req, resp);
		}
		else if(path.equals("/editGroupe.do") && req.getMethod().equals("POST")){
			int id=Integer.parseInt(req.getParameter("id"));
			String nomGrp=req.getParameter("nomGrp");
			String UE=req.getParameter("UE");
			groupe g=new groupe(nomGrp, UE);
			g.setId_groupe(id);
			groupeMetier.updateGroupe(g);
			req.setAttribute("groupe", g);
			req.getRequestDispatcher("ConfirmationGrp.jsp").forward(req, resp);
		}
//		else{
//			resp.sendError(resp.SC_NOT_FOUND);
//		}
		//req.getRequestDispatcher("professeurs.jsp").forward(req,resp);
		String path1=req.getServletPath();
		if(path1.equals("/indexP.do")){
			ProfesseurModel modelP=new ProfesseurModel();
			List<Professeur> profs=profMetier.Afficher_prof();
			modelP.setProfesseurs(profs);
			req.setAttribute("modelP", modelP);
			req.getRequestDispatcher("affichage.jsp").forward(req, resp);
		}
		else if(path1.equals("/chercherProf.do")){
			String motCle1=req.getParameter("motCle1");
			ProfesseurModel modelP=new ProfesseurModel();
			modelP.setMotCle1(motCle1);
			List<Professeur> profs=profMetier.professeurParMC("%"+motCle1+"%");
			modelP.setProfesseurs(profs);
			req.setAttribute("modelP", modelP);
			req.getRequestDispatcher("professeurs.jsp").forward(req, resp);
		}
		else if(path1.equals("/saisir.do")){
			req.getRequestDispatcher("ajout.jsp").forward(req, resp);
		}
		else if(path1.equals("/ajouterP.do")&&(req.getMethod().equals("POST"))){
			String nm=req.getParameter("nom");
			String pnm=req.getParameter("prenom");
			String em=req.getParameter("email");
			String tl=req.getParameter("tel");
			Professeur p=profMetier.Ajouter_prof(new Professeur(nm,pnm,em,tl));
			req.setAttribute("professeur", p);
			req.getRequestDispatcher("Confirmation.jsp").forward(req, resp);
		}
		else if(path1.equals("/supprimerProf.do")){
			int id=Integer.parseInt(req.getParameter("id"));
			profMetier.Supprimer_prof(id);
			resp.sendRedirect("indexP.do");
			}
		else if(path1.equals("/editProf.do")){
			int id=Integer.parseInt(req.getParameter("id"));
			Professeur p=profMetier.Consulter_prof(id);
			req.setAttribute("Professeur", p);
			req.getRequestDispatcher("editProf.jsp").forward(req, resp);
		}
		else if(path1.equals("/editProfesseur.do") && req.getMethod().equals("POST")){
			int id=Integer.parseInt(req.getParameter("id"));
			String nm=req.getParameter("nom");
			String pnm=req.getParameter("prenom");
			String em=req.getParameter("email");
			String tl=req.getParameter("tel");
			Professeur p=profMetier.Modifier_prof(new Professeur(nm,pnm,em,tl));
			p.setId_professeur(id);
			req.setAttribute("professeur", p);
			req.getRequestDispatcher("Confirmation.jsp").forward(req, resp);
		}
		}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	}
	
