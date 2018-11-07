package feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("TEST-SERVICE")
public interface TestService {
    @RequestMapping("/test")
    String test();
}
