package telran.sensor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"telran"})
public class SensorRangeProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensorRangeProviderApplication.class, args);
	}

}
