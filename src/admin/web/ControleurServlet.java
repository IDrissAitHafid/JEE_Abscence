package admin.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.IGroupeDao;
import admin.ImplGroupeDao;

public class ControleurServlet extends HttpServlet{
	private IGroupeDao groupeMetier;
	private void intit() {
		groupeMetier=new ImplGroupeDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("groupes.jsp").forward(req,resp);
	}
}
