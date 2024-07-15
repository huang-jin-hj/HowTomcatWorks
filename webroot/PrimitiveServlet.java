//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PrimitiveServlet implements Servlet {
    public PrimitiveServlet() {
    }

    public void init(ServletConfig var1) throws ServletException {
        System.out.println("init");
    }

    public void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter var3 = var2.getWriter();
        var3.println("Hello. Roses are red.");
        var3.print("Violets are blue.");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }
}
