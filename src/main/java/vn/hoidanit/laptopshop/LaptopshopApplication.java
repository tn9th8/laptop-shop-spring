package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {
		// app = container
		SpringApplication.run(LaptopshopApplication.class, args);

		// ApplicationContext context =
		// SpringApplication.run(LaptopshopApplication.class, args);

		// // print list of beans:
		// for (String s : context.getBeanDefinitionNames()) {
		// System.out.println(s);
		// }
	}

}
