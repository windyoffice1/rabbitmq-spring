package com.windyoffice.rabbitmqspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqSpringApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private RabbitAdmin rabbitAdmin;

	@Test
	public void testRabittAdmin(){
		//定义一个直连交换机
		rabbitAdmin.declareExchange(new DirectExchange("test.Direct",false,false));

		//定义一个主题交换机
		rabbitAdmin.declareExchange(new TopicExchange("test.Topic",false,false));

		//定义一个不处理路由交换机
		rabbitAdmin.declareExchange(new FanoutExchange("test.Fanout",false,false));




	}
}
