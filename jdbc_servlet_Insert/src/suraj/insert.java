package suraj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insert
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
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
	    String Dname=request.getParameter("Dname");
	    int Dnumber=Integer.parseInt(request.getParameter("Dnumber"));
		int Mgr_id=Integer.parseInt(request.getParameter("Mgr_id"));
		Connection conn;
		PreparedStatement pst;
	    ResultSet rs;
	    String sq1="insert into department(Dname,Dnumber,Mgr_id,) value(?,?,?)";
	    
	    try
		{
		Class.forName("com.mysql.jdbc.Driver"); //Registration of Driver for mysql
		conn=DriverManager.getConnection("jdbc:mysql:///company01","root","root");
		pst=conn.prepareStatement("sq1");
		pst.setString(1,Dname);
		pst.setInt(2,Dnumber);
		pst.setInt(3,Mgr_id);
		pst.executeUpdate();// executing SQL Statement
		} //end opf try block
		catch(Exception er)
		{
		out.print(er);	
		}
	}

}
