package com.yedy.userservice;

import com.yedy.userservice.mikroservices.RoomClient;
import com.yedy.userservice.model.RoomDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserServiceApplication  implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceApplication.class);

	@Autowired
	private RoomClient roomClient;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*try {
			RoomDto resp = roomClient.testRoom();
			logger.info("Response body: [{}]", resp);
		} catch (Exception e) {
			logger.error("An exception occurred call order service: ", e);
		}*/
	}
}
