package br.com.diego.diegoeventos.produtor;

import br.com.diego.diegoeventos.servico.ServicoEnvioMensagensKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class ProdutorController {

    @Autowired
    private ServicoEnvioMensagensKafka servicoEnvioMensagensKafka;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem) {
        servicoEnvioMensagensKafka.enviarMensagem(mensagem);
    }
}