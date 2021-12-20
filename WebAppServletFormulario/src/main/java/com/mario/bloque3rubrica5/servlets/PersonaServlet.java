package com.mario.bloque3rubrica5.servlets;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mario.bloque3rubrica5.entities.Persona;
import com.mario.bloque3rubrica5.repos.PersonaRepo;

import java.io.IOException;

public class PersonaServlet extends BaseServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doSomething(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doSomething(req, resp);
	}

	private void doSomething(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PersonaRepo repo = new PersonaRepo();
		Persona persona = getPersonaFromRequest(req);
		repo.insertOrUpdate(persona);
		persona = repo.findByName(persona.getName());
		req.setAttribute("persona", persona);
		redirect(req, resp, "end.jsp");
	}
}