package com.fblogin;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemoCookieDelete extends HttpServlet{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//
		// To delete a cookie, we need to create a cookie that have the same
		// name with the cookie that we want to delete. We also need to set
		// the max age of the cookie to 0 and then add it to the Servlet's
		// response method.
		//
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		Cookie[] cookie = request.getCookies();
		for (Cookie obj : cookie) {

			if (obj == null) {
				pw.println("nie ma cookie");

				break;
			}
			// if(obj.getName().equals("url")){
			pw.println(obj.getName() + " : " + obj.getValue());
			// break;
			// }
			Cookie cookie1 = new Cookie(obj.getName(), "");
			cookie1.setMaxAge(0);
			response.addCookie(cookie1);
		}
		for (Cookie obj : cookie) {

			if (obj == null) {
				pw.println("nie ma cookie");

				break;
			}
			// if(obj.getName().equals("url")){
			pw.println(obj.getName() + " : " + obj.getValue());
			// break;
		}
	}
}
