package com.fblogin;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = -4433102460849019660L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// request.getSession().invalidate();
		// response.sendRedirect(request.getContextPath()+ "/");
		//
		String fbUser = null;
		request.getSession().setAttribute("fbUser", fbUser);
		request.getSession().getServletContext()
				.removeAttribute(getServletInfo());
		request.getSession().invalidate();
		Cookie[] cookies = request.getCookies();
		if (cookies != null)
			for (int i = 0; i < cookies.length; i++) {
				cookies[i].setValue("");
				cookies[i].setPath("/");
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
			}
		response.sendRedirect("https://localhost:8443/LogowanieFacebook/index.jsp");
	}
}
