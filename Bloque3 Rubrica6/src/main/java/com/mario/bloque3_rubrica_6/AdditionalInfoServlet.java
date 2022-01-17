package com.kerjox.bloque3_rubrica_6a_servlet_made_with_annotations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(
				name = "additionalInfo",
				description = "Servlet with additional information",
				urlPatterns = {"/additionalInfo"}
)
public class AdditionalInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.print("<html><body>");
		out.print("<h1>AdditionalInfo</h1>");
		out.print("</html></body>");
	}
}
