package com.syb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/goodServlet")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        if (session != null) {
//            Object obj = session.getAttribute("acc");
//            if (obj != null) {
//                request.getRequestDispatcher("success.jsp").forward(request, response);
//                return;
//            }
//
//        }

        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
