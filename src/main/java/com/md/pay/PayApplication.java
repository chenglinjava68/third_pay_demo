package com.md.pay;

import com.md.pay.unionpay.listener.PropertiesListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cheng
 */
@SpringBootApplication
public class PayApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(PayApplication.class);
		application.addListeners(new PropertiesListener());
		application.run(args);
	}
}
