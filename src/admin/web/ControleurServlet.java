package admin.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import admin.IGroupeDao;
import admin.ImplGroupeDao;
import admin.groupe;

public class ControleurServlet extends HttpServlet{
	private IGroupeDao groupeMetier;
	@Override
	public void init() throws ServletException {
		groupeMetier=new ImplGroupeDao();
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
	}
}
