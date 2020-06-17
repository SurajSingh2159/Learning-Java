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
 * Servlet implementation class process
 */
@WebServlet("/process")
public class process extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public process() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		  response.setContentType("text/html");
		    PrintWriter out=response.getWriter();
			Connection conn;//declare the ref. var. of conncetion interface
			PreparedStatement pst;// declare the ref. var. of PreparedStatement Interface
			ResultSet rs;//declare the ref var. of ResultSet interface
			try
			{
			Class.forName("com.mysql.jdbc.Driver"); //Registration of Driver for mysql
			conn=DriverManager.getConnection("jdbc:mysql:///company01","root","root");
			pst=conn.prepareStatement("select * from department");
			rs=pst.executeQuery();
			out.print("<table border='1' align='center'>");
			while(rs.next())
			{
				out.print("<tr><th>"+rs.getString(1)+"</th><th>"+rs.getInt(2)+"</th><th>"+rs.getInt(3)+"</th><th>"+rs.getDate(4)+"</th></tr>");
				} 
			out.print("</table>");
				} //end opf try block
				catch(Exception er)
				{
				out.print(er);	
				}
	}

}
