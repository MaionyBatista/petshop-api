package br.com.tt.petshop.client.credito;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "credito-api",
        url = "https://imersao-credito-api.herokuapp.com")
public interface CreditoApiClient {

    @GetMapping("/credito/{cpf}")
    SituacaoCliente obterSituacaoCredito(@PathVariable("cpf") String cpf);
}