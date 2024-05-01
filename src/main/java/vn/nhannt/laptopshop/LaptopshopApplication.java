package vn.nhannt.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Spring boot
// Spring container (beans, context)
// include: bao gom >< exclude: loai bo
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LaptopshopApplication {

	public static void main(String[] args) {
		// app = container
		SpringApplication.run(LaptopshopApplication.class, args);

		// // print list of beans:
		// ApplicationContext context =
		// SpringApplication.run(LaptopshopApplication.class, args);
		// for (String s : context.getBeanDefinitionNames()) {
		// System.out.println(s);
		// }
	}

}
