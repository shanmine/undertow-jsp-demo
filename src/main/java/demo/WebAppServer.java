package demo;

import com.jfinal.server.undertow.UndertowServer;
import io.undertow.jsp.HackInstanceManager;
import io.undertow.jsp.JspServletBuilder;
import org.apache.jasper.deploy.JspPropertyGroup;
import org.apache.jasper.deploy.TagLibraryInfo;

import java.util.HashMap;

public class WebAppServer {

    public static void main(final String[] args) {
        // JettyServer
        //JFinal.start("src/main/webapp", 80, "/", 5);

        // UndertowServer
        //UndertowServer.start(AppConfig.class, 80, true);

        // UndertowServer with jsp
        UndertowServer.create(AppConfig.class).configWeb(wb -> {
            wb.getDeploymentInfo().addServlet(JspServletBuilder.createServlet("Default Jsp Servlet", "*.jsp"));
            HashMap<String, TagLibraryInfo> tagLibraryInfo = new HashMap<>();
            JspServletBuilder.setupDeployment(wb.getDeploymentInfo(), new HashMap<String, JspPropertyGroup>(), tagLibraryInfo,
                    new HackInstanceManager());
            wb.addErrorPage(404, "/error/404.jsp");
            wb.addErrorPage(500, "/error/500.jsp");
        }).setHost("localhost").setPort(8080).setDevMode(true).start();
    }

}