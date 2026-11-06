package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.model.Studentdb;

/**
 * Servlet implementation class RegistrationsServlet
 */
@WebServlet("/RegistrationsServlet")
public class RegistrationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// Extract form parameters
			String roll = request.getParameter("rollno");
			String sname = request.getParameter("sname");
			String gender = request.getParameter("Gender");
			String course = request.getParameter("course");
			String address = request.getParameter("addr");
			
			// Validate that all parameters are provided
			if (roll == null || roll.isEmpty() || sname == null || sname.isEmpty() ||
				gender == null || gender.isEmpty() || course == null || course.isEmpty() ||
				address == null || address.isEmpty()) {
				System.err.println("Error: Missing required form parameters");
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "All fields are required");
				return;
			}
			
			// Convert roll number to integer
			int rollno;
			try {
				rollno = Integer.parseInt(roll);
			} catch (NumberFormatException e) {
				System.err.println("Error: Invalid roll number format - " + roll);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Roll number must be a valid integer");
				return;
			}
			
			// Log registration attempt
			System.out.println("Registering student - Roll: " + rollno + ", Name: " + sname);
			
			// Create Student object and save to database
			Student s = new Student(rollno, sname, gender, course, address);
			Studentdb sdb = new Studentdb();
			sdb.connectdb(s);
			
			System.out.println("Student registration successful for roll number: " + rollno);
			
			// Redirect to Login Page
			RequestDispatcher view = request.getRequestDispatcher("LoginPage.jsp");
			view.forward(request, response);
		} catch (Exception e) {
			System.err.println("Error during student registration: " + e.getMessage());
			e.printStackTrace();
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An error occurred during registration");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
