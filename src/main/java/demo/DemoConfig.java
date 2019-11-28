package demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig {

    public static void main(String[] args) {
        // UndertowServer
        //UndertowServer.start(DemoConfig.class, 80, true);

        // JettyServer
        //JFinal.start("src/main/webapp", 80, "/", 5);
    }

    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setDenyAccessJsp(false);
    }

    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
    }

    public void configEngine(Engine me) {
    }

    public void configPlugin(Plugins me) {
    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
    }
}