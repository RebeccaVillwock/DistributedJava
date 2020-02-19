import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "SearchServlet", urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    private final String DRIVER_NAME = "jdbc:derby";
    private final String DATABASE_PATH = "../../db";
    private final String SCHEMA = "rebecca";
    private final String PASSWORD = "rebecca";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try{
            String searchTerm = request.getParameter("miniName");

            //load driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            // Find the absolute path of the database folder
            String absPath = getServletContext().getRealPath("/") + DATABASE_PATH;

            //build string
            StringBuilder sql = new StringBuilder("select name, description");
            sql.append("from minis");

            //create connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, SCHEMA, PASSWORD);
            //create statement to execute SQL
            pstmt = conn.prepareStatement(sql.toString());
            //Fill the prepared statement params
            pstmt.setString(1, searchTerm);
            //Execute a SELECT query and get a result set
            rset = pstmt.executeQuery();

            //create StringBuilder for ease of appending strings
            StringBuilder output = new StringBuilder();

            //basic html to create page
            output.append("<html><head><link type='text/css' rel='stylesheet' href='../resources/css/style.css'></head>");
            output.append("<body>");

            //table
            output.append("<table>");
            //row
            output.append("<tr>");
            //headers
            output.append("<th>Name</th><th>Description</th>");
            //end row
            output.append("</tr>");

            //loop through result set's rows
            while(rset.next()){
                //row
                output.append("<tr>");
                //get first string(mini name)
                String miniName = rset.getString(1);
                //add cell with info
                output.append("<td>" + miniName + "</td>");

                //get second string
                String miniDescription = rset.getString(2);
                //add cell with info
                output.append("<td>" + miniDescription + "</td>");

                //end row
                output.append("</tr>");
            }



        }catch(Exception e){

        }
    }
}
