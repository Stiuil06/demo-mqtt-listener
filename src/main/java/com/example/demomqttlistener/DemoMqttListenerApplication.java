package com.example.demomqttlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;

@SpringBootApplication
public class DemoMqttListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMqttListenerApplication.class, args);
    }


    @Bean
    public IntegrationFlow mqttInbound() {
        return IntegrationFlows.from(
                new MqttPahoMessageDrivenChannelAdapter("tcp://127.0.0.1:1883",
                        "testClient", "topic1", "topic2"))
                .handle(m -> System.out.println(m.getPayload()))
                .get();
    }
}
