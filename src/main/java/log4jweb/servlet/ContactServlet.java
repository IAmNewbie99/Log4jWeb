package log4jweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(urlPatterns = { "/contact"})
public class ContactServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   static final Logger LOGGER = LogManager.getLogger(ContactServlet.class);
   
   public ContactServlet() {
       super();
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/contactView.jsp");    
       dispatcher.forward(request, response);     
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
	   String email = request.getParameter("Email");
	   LOGGER.info("Contact Email:{}", email);
       request.getRequestDispatcher("/WEB-INF/views/contactView.jsp").forward(request, response);
   }

}