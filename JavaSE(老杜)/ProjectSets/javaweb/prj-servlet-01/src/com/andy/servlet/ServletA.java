package com.andy.servlet;

import com.andy.entity.User;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class ServletA implements Servlet {

    private ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        ServletConfig config = this.getServletConfig();
        ServletContext application  = config.getServletContext();
        //1.获取上下文初始参数
        Enumeration<String> enumeration = application.getInitParameterNames();
        while (enumeration.hasMoreElements()){
            String initName = enumeration.nextElement();
            System.out.println("ServletA: " + initName + application.getInitParameter(initName));
        }

        User use1 = new User();
        use1.setNo("9527");
        use1.setName("jack");
        use1.setAge(12);
        application.setAttribute("st1",use1);

    }

    @Override
    public void destroy() {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }
}
