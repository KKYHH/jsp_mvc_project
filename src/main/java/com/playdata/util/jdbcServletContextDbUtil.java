package com.playdata.util;

import javax.servlet.ServletContext;
import java.sql.Connection;

public class jdbcServletContextDbUtil implements DbUtil{

    @Override
    public Connection getConnection(ServletContext servletContext) {
        return (Connection) servletContext.getAttribute("conn");
    }
}
