package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ListProduct;
import model.product;

/**
 * Servlet implementation class SearchControll
 */
@WebServlet("/search")
public class SearchControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchControll() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	   response.setContentType("text/html;charset=UTF-8");
 	   String txtSearch = request.getParameter("txt");
 	   ListProduct dao = new ListProduct();
 	   List<product> list = dao.seacrhByName(txtSearch);
 	   request.setAttribute("listP", list);
 	   request.getRequestDispatcher("home.jsp").forward(request, response);
 	   
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
