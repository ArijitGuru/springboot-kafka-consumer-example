package com.arijit.kafka.springbootkafkaconsumerexample.listener;

import com.arijit.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_topic_example", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed message is : " + message);
    }

    @KafkaListener(topics = "Kafka_topic_json_example", groupId = "group_json",
            containerFactory = "kafkaListenerContainerFactoryJson")
    public void consumeJson(User user){
        System.out.println("Consumed User is : " + user.toString());
    }
}
