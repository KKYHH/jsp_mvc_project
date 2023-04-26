package com.playdata.web;

import com.playdata.dto.BoardDto;
import com.playdata.service.BoardService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        BoardService service = new BoardService();

        BoardDto board = service.getBoard(id, req);

        req.setAttribute("board",board);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/view.jsp");
        dispatcher.forward(req,resp);

    }
}
