package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.DaoContactos;
import model.Contacto;


@WebServlet("/EliminarAction")
public class EliminarAction extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoContactos dao=new DaoContactos();
		int id=Integer.parseInt(request.getParameter("id"));
        dao.eliminarContacto(id); 
	}
}
