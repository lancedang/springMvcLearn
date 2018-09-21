package com.springmvc.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JMSProperties {


    @Value("${jms.queue}")
    private String queue;

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        return "JMSProperties{" +
                "queue='" + queue + '\'' +
                '}';
    }
}
