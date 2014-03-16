package org.xilaew.judo;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterParticipants
 */
@WebServlet("/RegisterParticipants")
public class RegisterParticipants extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterParticipants() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String[]> input = request.getParameterMap();
		
		for(Entry<String,String[]> e : input.entrySet()){
			System.out.print(e.getKey()+":=");
			for (String s : e.getValue()){
				System.out.print(s+", ");
			}
			System.out.println();
		}
		response.getWriter().write("sucess");
	}

}
