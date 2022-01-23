package pro.wpinchine.demoof.spring.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述
 *
 * @author wpinchine
 * @date 2022年01月21日 21:26
 */
@RestController
@SpringBootApplication
public class WebfluxDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxDemoApp.class,args);
    }

    @RequestMapping("/test")
    public Map<String,Object> test(){
        Map<String,Object> rstMap = new HashMap<>();
        rstMap.put("rst",true);
        return rstMap;
    }
}
