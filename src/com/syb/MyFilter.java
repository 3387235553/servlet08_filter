package com.syb;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");


        String url = request.getRequestURL().toString();
        if (url.endsWith("/index.jsp") || url.endsWith("/") || url.endsWith("/login")) {

        } else {
            HttpSession session = request.getSession();
//            Cookie[] cookies = request.getCookies();
            if (session != null) {
                Object obj = session.getAttribute("acc");
                if (obj == null) {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            }
        }

        //放行
        filterChain.doFilter(request, response);
    }
}
