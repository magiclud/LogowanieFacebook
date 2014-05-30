package com.fblogin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemoCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		Cookie[] cookie = request.getCookies();
		pw.println("All Cookies in your browsers");
		if (cookie != null) {
			for (Cookie obj : cookie) {

				// if(obj.getName().equals("url")){
				pw.println(obj.getName() + " : " + obj.getValue());
				// break;
				// }
			}
		} else {
			pw.println("nie ma cookie");
		}
	}
}