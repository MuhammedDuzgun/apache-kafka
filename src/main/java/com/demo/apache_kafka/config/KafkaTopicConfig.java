package com.demo.apache_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic appTopic() {
        return TopicBuilder.name("app-topic")
                .build();
    }

    @Bean
    public NewTopic appTopicJson() {
        return TopicBuilder.name("app-topic-json")
                .build();
    }

}
