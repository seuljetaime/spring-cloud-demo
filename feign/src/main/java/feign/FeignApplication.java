package feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class FeignApplication {

    @Autowired
    TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @RequestMapping(value = "/test")
    public String helloCustomer() {
        return testService.test();
    }
}
