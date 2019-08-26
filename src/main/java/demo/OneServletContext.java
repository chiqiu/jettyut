package demo;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.*;
import java.io.IOException;

public class OneServletContext
{
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8082);

        WebAppContext webapp = new WebAppContext("defaultroot","/");
        server.setHandler(webapp);

        server.start();
        server.dumpStdErr();

        server.join();
    }

}