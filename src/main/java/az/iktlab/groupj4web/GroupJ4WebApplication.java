package az.iktlab.groupj4web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GroupJ4WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroupJ4WebApplication.class, args);

    }

}
