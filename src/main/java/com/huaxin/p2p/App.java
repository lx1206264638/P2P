package com.huaxin.p2p;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.huaxin.p2p.dao")
//启注解事务管理
//@EnableTransactionManagement
//@EnableScheduling//开启定时任务
public class App {
	
	 @Bean
	 public Queue queue() {
	    return new ActiveMQQueue("sample.queue");

	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
