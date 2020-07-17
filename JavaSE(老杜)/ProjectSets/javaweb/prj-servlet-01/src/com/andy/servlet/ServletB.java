package com.andy.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.function.DoubleToIntFunction;

public class ServletB implements Servlet {

    private ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        ServletConfig config = this.getServletConfig();
        ServletContext application = config.getServletContext();
        //1. 获取Servlet上下文初始参数名 集合
        Enumeration<String> enumeration = application.getInitParameterNames();
        while (enumeration.hasMoreElements()){
            String initName = enumeration.nextElement();
            //2. 通过上下文参数名获取参数值
            System.out.println("ServletB: " + initName + application.getInitParameter(initName));
        }
        //3.
        //E:\B站学习\java-route\JavaSE(老杜)\ProjectSets\javaweb\out\artifacts\prj_servlet_01_war_exploded2\taobao\ServletB
        String realpath0 = application.getRealPath("/ServletB");
        System.out.println("ServletB：" + realpath0);

        //E:\B站学习\java-route\JavaSE(老杜)\ProjectSets\javaweb\out\artifacts\prj_servlet_01_war_exploded2\taobao\html\welcome.html
        String realpath1 = application.getRealPath("/html/welcome.html");
        System.out.println("welcome1: " + realpath1);

        String realpath2 = application.getRealPath("html/welcome.html");
        System.out.println("welcome2: " + realpath2);
        //不需要加webappname
//        String realpath3 = application.getRealPath("/taobao/html/welcome.html");
//        System.out.println("welcome2: " + realpath3);
        //取出Servlet上下文中数据
        Object obj = application.getAttribute("st1");
        response.getWriter().print(obj);
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
