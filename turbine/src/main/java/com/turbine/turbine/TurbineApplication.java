package com.turbine.turbine;

import org.apache.commons.logging.Log;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@EnableTurbineStream
public class TurbineApplication {
	//private static final Logger LOG = LoggerFactory.getLogger(TurbineApplication.class);


	public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(TurbineApplication.class).run(args);

       System.out.println("===========================================>Connected to RabbitMQ at: {}======>"+ ctx.getEnvironment().getProperty("spring.rabbitmq.host"));
    }
}
