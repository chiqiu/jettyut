package demo;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello");
        resp.getWriter().close();

    }

    @Override
    public void init() throws ServletException {

        try {
            Thread.sleep(1000l);
            System.out.println("hello");
        }catch (Exception e){

        }finally {
            ServletRegistration dynamic = getServletContext().addServlet(HiServlet.class.getName(),HiServlet.class);
            dynamic.addMapping("/hi/*");
        }

    }
}
