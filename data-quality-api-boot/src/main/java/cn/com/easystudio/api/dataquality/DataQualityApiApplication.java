package cn.com.easystudio.api.dataquality;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class DataQualityApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataQualityApiApplication.class, args);
    }
}
