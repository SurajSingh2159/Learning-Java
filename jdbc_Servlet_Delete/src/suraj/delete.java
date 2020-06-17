package suraj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    Connection conn;
		PreparedStatement pst;
	    String Dnumber=request.getParameter("Dnumber");
	    String query="delete from department where Dnumber="+Integer.parseInt(Dnumber);
	int n=0;
	    try
	{
		Class.forName("com.mysql.jdbc.Driver"); //Registration of Driver for mysql
		conn=DriverManager.getConnection("jdbc:mysql:///company01","root","root");
		pst=conn.prepareStatement(query);
		n=pst.executeUpdate();
		if(n==0)
		{
			out.print("<h2>No such Record found</h2>");
		}
	}
	catch(Exception er)
	{
	out.print(er);	
	}
	}

}
