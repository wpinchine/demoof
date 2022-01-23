package pro.wpinchine.demoof.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wpinchine
 */
@RestController
@SpringBootApplication
public class WebDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(WebDemoApp.class, args);
    }

    @RequestMapping("/test")
    public Map<String,Object> test(){
        Map<String,Object> rstMap = new HashMap<>();
        rstMap.put("rst",true);
        return rstMap;
    }

}
