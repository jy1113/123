package com.jk.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMq {

    @Bean
    public Queue messageQueue(){
        return new Queue("1808_queue");
    }

    @Bean
    public Queue messageQueue2(){
        return new Queue("1808_queue2");
    }
}
