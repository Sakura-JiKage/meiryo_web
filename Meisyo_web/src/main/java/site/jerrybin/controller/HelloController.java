package site.jerrybin.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(Model m){
        m.addAttribute("name","宫水三叶");
        return "index";  //视图重定向index.jsp
    }
}
