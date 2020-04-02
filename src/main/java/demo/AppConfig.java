package demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.template.Engine;

public class AppConfig extends JFinalConfig {
    public void configConstant(Constants me) {
        PropKit.use("app.properties", "UTF-8");
        me.setEncoding("utf-8");
        me.setDenyAccessJsp(false);
        me.setDevMode(PropKit.getBoolean("devMode", false));
    }

    public void configRoute(Routes me) {
        me.add("/", IndexController.class);
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