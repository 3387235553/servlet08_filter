package com.syb;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String account = request.getParameter("account");

        if ("admin".equals(account)) {

            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(10);
            session.setAttribute("acc", account);

            request.getRequestDispatcher("/goodServlet").forward(request, response);

        } else {
            response.sendRedirect("index.jsp");
        }


    }


//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        System.out.println("出生");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("死亡");
//    }
}
