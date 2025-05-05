package com.demo.apache_kafka.kafka;

import com.demo.apache_kafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(
            topics = "app-topic-json",
            groupId = "myGroup"
    )
    public void consume(User user) {
        LOGGER.info(String.format("Consumed user : %s", user.toString()));
    }

}
