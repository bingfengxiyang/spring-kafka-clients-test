package com.kafka.kafka.producer;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RestController
@Slf4j
public class ProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;



    @GetMapping("/producer1")
    public String sendOpearSimple1(String msg) {
        //发送消息
        ProducerRecord<String, String> record = new ProducerRecord<>("producer1", "producer1", msg);
        kafkaProducer.send(record);
        Math.round(-1.5);
        log.info("生产者发送消息成功");
        return "success";
    }

}
