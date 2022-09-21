package mk.ukim.finki.devops.devopshelloworldproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsHelloWorldProjectApplication {

    @GetMapping("helloWorld")
    public String getMessage(){
        return "Hello from Java running in Docker - branch main";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevOpsHelloWorldProjectApplication.class, args);
    }

}
