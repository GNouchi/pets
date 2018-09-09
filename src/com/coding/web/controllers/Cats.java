package com.coding.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coding.web.models.Cat;


@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cats() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("You dont belong here");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		int weight = Integer.parseInt(request.getParameter("weight"));		
		Cat cat = new Cat(name, breed, 4);
		request.setAttribute("cat", cat);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/cat.jsp");
        view.forward(request, response);
	}

}
