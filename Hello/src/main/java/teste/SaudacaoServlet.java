package teste;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaudacaoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>" + "<head><title>Hello</title></head>");

		out.println("<body bgcolor=\"#ffffff\">"
				+ "<h2>Olá, meu nome é Servlet. Qual o seu nome ? </h2>"
				+ "<h2> Qual o seu Hobby ? </h2>" + "<form method=\"get\">"
				+ "<input type=\"text\"name=\"nome\"size=\"25\">" + "<p></p>"
				+ "<input type=\"text\"name=\"hobby\"size=\"25\">" + "<p></p>"
				+ "<input type=\"submit\"value=\"Enviar\">"
				+ "<input type=\"reset\"value=\"Resetar\">" + "</form>");

		String nome = request.getParameter("nome");
		String hobby = request.getParameter("hobby");
		if ((nome != null) && (nome.length() > 0)) {
			out.println("<h2>Olá, " + nome + "! ");
		}
		if ((hobby != null)&& (hobby.length()>0)){
			out.println("<h2>Meu Hobby é " + hobby + "! ");
		}
		out.println("</body></html>");	
		out.close();
	}
}
