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
		}
		
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
		
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	}
	
