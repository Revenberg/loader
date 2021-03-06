package info.revenberg.loader;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// http://localhost:8099/invokejob
// http://localhost:8099/restart
// mvn spring-boot:run

@SpringBootApplication
@EnableAutoConfiguration // Spring Boot Auto Configuration
@EnableBatchProcessing
public class SpringBatchLoaderApplication {

	private static ConfigurableApplicationContext context;	
	public static void main(String[] args) {
		context =  SpringApplication.run(SpringBatchLoaderApplication.class, args);
	}

	public static void restart() {
        ApplicationArguments args = context.getBean(ApplicationArguments.class);
 
        Thread thread = new Thread(() -> {
            context.close();
            context = SpringApplication.run(SpringBatchLoaderApplication.class, args.getSourceArgs());
        });
 
        thread.setDaemon(false);
        thread.start();
    }
 
}