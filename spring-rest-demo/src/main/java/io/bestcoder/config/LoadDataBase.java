package io.bestcoder.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.bestcoder.entity.Employee;
import io.bestcoder.entity.Order;
import io.bestcoder.enumeration.Status;
import io.bestcoder.repository.EmployeeRepository;
import io.bestcoder.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDataBase {

	@Bean
	public CommandLineRunner initDatabase(EmployeeRepository repository ,OrderRepository orderRepository) {
		return args -> {
			orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
			orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

			orderRepository.findAll().forEach(order -> {
			  log.info("Preloaded " + order);
			});
			log.info("Preloading " + repository.save(new Employee("Bilbo","Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo","Baggins ", "thief")));
		};
	}
}