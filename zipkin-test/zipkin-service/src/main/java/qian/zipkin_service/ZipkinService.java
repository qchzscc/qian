package qian.zipkin_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ZipkinService {
    
    private final Logger logger= LoggerFactory.getLogger(ZipkinService.class);
    
    @RequestMapping(value="/hello")
    public String Hello(){
        logger.info("Hello is called");
        return "Hello";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ZipkinService.class, args);
    }
}
