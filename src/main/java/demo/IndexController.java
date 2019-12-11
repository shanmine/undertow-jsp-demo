package demo;

import com.jfinal.core.Controller;
import com.jfinal.render.ContentType;

public class IndexController extends Controller {
    public void index() {
        renderText("Hello, world!", ContentType.TEXT);
    }
}
