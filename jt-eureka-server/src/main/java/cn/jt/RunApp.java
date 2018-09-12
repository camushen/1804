package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer//启动eurekaServer服务
public class RunApp {
	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}
}
