package pollen.pollen_discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PollenDiscoveryserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PollenDiscoveryserviceApplication.class, args);
    }

}
