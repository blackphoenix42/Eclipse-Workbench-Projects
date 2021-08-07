package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        super();
        
    }

    String data,abc;
	@Override
	public void init(){
		data = getServletConfig().getInitParameter("users");
		abc = getServletContext().getInitParameter("abc");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//String name = request.getParameter("user");
//		if(name.equals("")||name==null) {
//			out.println("Hello "+data);
//		}else {
//			out.println("Hello "+name);
//		}
//		out.println(abc);
	    String param = request.getParameter("nextUrl");
	    if (param!=null) {
	        // append an encoded url to carry the sessionids
	        String targetUrl = response.encodeURL(param);
	        
	        out.print(targetUrl);
	        
	    }
		
	}

}
