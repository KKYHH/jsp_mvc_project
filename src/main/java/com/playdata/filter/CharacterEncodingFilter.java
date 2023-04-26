package com.playdata.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // Servlet 이전에 동작: request, response의 인코딩을 UTF-8로 지정
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding(("UTF-8"));

        filterChain.doFilter(servletRequest,servletResponse);

    }
}
