package org.xilaew.judo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Clubs
 */
@WebServlet("/Clubs")
public class Clubs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String names[] = {"FSV Harburg","Harburger Turner Bund"};
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Clubs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> res = new ArrayList<String>();
		String term = request.getParameter("term");
		if (term==null || term.length()<2){
			response.getWriter().write("noData");
			return;
		}
		term = term.toLowerCase();
		term = Character.toUpperCase(term.charAt(0))+term.substring(1);
		System.out.println("term="+term);
		for (int i=0,j=0; i<10 && j<names.length;j++){
			String s = names[j];
			if (s.startsWith(term)){
				res.add(s);
				System.out.println(s);
				i++;
			};
		}
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(res));
	}

}
