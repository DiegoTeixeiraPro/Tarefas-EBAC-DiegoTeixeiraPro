package br.com.diego.diegoeventos.configuracao;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopico {
    @Value("${kafka.diego.nome.topico}")
    private String nomeTopicoDiego;

    @Bean
    public NewTopic topicoDiego() {
        return TopicBuilder.name(nomeTopicoDiego).partitions(3).replicas(2).build();
    }
}