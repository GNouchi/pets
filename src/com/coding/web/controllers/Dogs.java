package com.coding.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coding.web.models.Dog;

@WebServlet("/Dogs")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Dogs() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("You dont belong here");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		int weight = Integer.parseInt(request.getParameter("weight"));		
		Dog dog = new Dog(name, breed, 4);
		request.setAttribute("dog", dog);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dog.jsp");
        view.forward(request, response);
	}

}
