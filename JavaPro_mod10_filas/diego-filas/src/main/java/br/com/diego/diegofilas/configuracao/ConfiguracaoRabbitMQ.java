package br.com.diego.diegofilas.configuracao;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfiguracaoRabbitMQ {
    public static final String NOME_FILA = "fila-diego";
    public static final String NOME_EXCHANGE = "exchange-diego";
    public static final String NOME_ROTA = "diego.rota.#";


    @Bean
    public Queue queue() {
        return new Queue(NOME_FILA, false);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(NOME_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(NOME_ROTA);
    }
}