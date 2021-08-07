package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
//	      response.getWriter().append("Served at: ").append(request.getContextPath());
		String targetUrl = request.getContextPath();
		HttpSession session=request.getSession();
		String id=session.getId();
		PrintWriter out = response.getWriter();
//		out.println("<br>");
//        out.print(". You want to go <a href=\"");
//        out.print(targetUrl+"?id="+id);
//        out.print("\">here next</a>.");
		 out.println("Click <A HREF=\"" + response.encodeURL(request.getRequestURI()) + "\">here</A>");
	}

}
