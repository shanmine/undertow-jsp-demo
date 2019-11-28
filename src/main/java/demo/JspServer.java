package demo;

import com.jfinal.server.undertow.UndertowServer;
import io.undertow.jsp.HackInstanceManager;
import io.undertow.jsp.JspServletBuilder;
import org.apache.jasper.deploy.JspPropertyGroup;
import org.apache.jasper.deploy.TagLibraryInfo;

import java.util.HashMap;

public class JspServer {

    public static void main(final String[] args) {
        UndertowServer.create(DemoConfig.class).configWeb(wb -> {
            wb.getDeploymentInfo().addServlet(JspServletBuilder.createServlet("Default Jsp Servlet", "*.jsp"));
            HashMap<String, TagLibraryInfo> tagLibraryInfo = new HashMap<>();
            JspServletBuilder.setupDeployment(wb.getDeploymentInfo(), new HashMap<String, JspPropertyGroup>(), tagLibraryInfo,
                    new HackInstanceManager());
        }).setHost("localhost").setPort(8080).setDevMode(true).start();
    }

}