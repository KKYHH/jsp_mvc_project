package com.playdata.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class DbConnectionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // web.xml 에서 context-param 지정한 값을 불러오기
        String dbUrl = sce.getServletContext().getInitParameter("DB_URL");
        String dbUser = sce.getServletContext().getInitParameter("DB_USER");
        String dbPassword = sce.getServletContext().getInitParameter("DB_PASSWORD");

        try {
            // Driver load
            Class.forName("org.mariadb.jdbc.Driver");

            // Connection 객체를 생성 ( 생성이 됐다면 DB와 연결이 된 것 )
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // 생성된 Connection 객체를 ServletContext에 Attribute로 저장
            sce.getServletContext().setAttribute("conn",conn);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // ServletContext가 종료 ( WAS: Tomcat 종료 ) 될 때 Connection 객체를 close --> 메모리 누수를 방지
        Connection conn = (Connection) sce.getServletContext().getAttribute("conn");
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
