package com.mario.bloque3rubrica5.servlets;




import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mario.bloque3rubrica5.entities.Persona;
import com.mario.bloque3rubrica5.utils.Utils;

import java.io.IOException;
import java.sql.Date;

public abstract class BaseServlet extends HttpServlet {

	protected Persona getPersonaFromRequest(HttpServletRequest req) {

		Persona persona = new Persona();
		persona.setName(req.getParameter("name"));
		persona.setBirthday(Date.valueOf(req.getParameter("birthday")));
		persona.setAge(Utils.getAge(persona.getBirthday()));
		persona.setStep(Integer.valueOf(req.getParameter("step")));

		return persona;
	}

	protected void redirect(HttpServletRequest req, HttpServletResponse resp, String jsp) throws ServletException, IOException {

		req.getRequestDispatcher(jsp).forward(req, resp);
	}
}
