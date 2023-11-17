package br.com.diego.diegoeventos.consumidor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumidor {

    @KafkaListener(topics = "${kafka.diego.nome.topico}", groupId = "diegoGroup")
    public void consumirMensagem(String mensagem) {
        System.out.println("====== RECEBENDO MENSAGEM ======");
        System.out.println("====== " + mensagem);
        System.out.println("====== FIM RECEBENDO MENSAGEM ======");
    }
}