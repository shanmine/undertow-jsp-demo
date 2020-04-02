package demo;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.POST;
import com.jfinal.render.ContentType;

import java.util.HashMap;
import java.util.Map;

public class IndexController extends Controller {
    public void index() {
        renderText("[IndexController]:Hello, world!", ContentType.TEXT);
    }

    @Before(POST.class)
    public void update() {
        String id = get("id");
        String title = get("title");

        String json = getRawData();

        System.out.println("Client post data:");
        System.out.println("id:" + id);
        System.out.println("title:" + title);
        System.out.println("json:" + json);

        Map<String, String> response = new HashMap<>();
        response.put("code", "001");
        response.put("message", "success");

        renderJson(response);
    }
}
