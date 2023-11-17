package br.com.diego.diegoeventos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ServicoEnvioMensagensKafka {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.diego.nome.topico}")
    private String nomeTopicoDiego;

    public void enviarMensagem(String mensagem) {
        System.out.println("====== ENVIANDO MENSAGEM: " + mensagem);

        kafkaTemplate.send(nomeTopicoDiego, mensagem);
    }
}