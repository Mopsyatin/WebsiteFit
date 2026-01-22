package ie.floral.flower_website;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FlowerWebsiteApplication {


    static void main(String[] args) {
		SpringApplication.run(FlowerWebsiteApplication.class, args);
	}



}
