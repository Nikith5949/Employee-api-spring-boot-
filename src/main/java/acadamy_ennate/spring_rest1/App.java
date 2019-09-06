package acadamy_ennate.spring_rest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class App {
	
	
	public static void main(String[] args) {
		
		SpringApplication app= new SpringApplication(App.class);
		app.run();
		
	}
}