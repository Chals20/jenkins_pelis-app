package daaw.pelisapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@EnableMongoRepositories
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PelisAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PelisAppApplication.class, args);
	}

}
