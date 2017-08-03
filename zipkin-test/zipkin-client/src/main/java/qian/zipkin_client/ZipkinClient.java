package qian.zipkin_client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



//@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ZipkinClient {
    private final Logger logger= LoggerFactory.getLogger(ZipkinClient.class);
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(value="/callhello")
    public String CallHello(){       
        logger.info("Calling Hello");
        return this.restTemplate.getForObject("http://localhost:9001/hello", String.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClient.class, args);
    }
    
}
