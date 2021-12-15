package br.com.tt.petshop.controller;

import br.com.tt.petshop.service.VacinaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/vacinas")
public class VacinaControler {

    private VacinaService vacinaService;

    public VacinaControler(VacinaService vacinaService) {

    }

    public List<String> listarVacinas() {
        vacinaService = new VacinaService();

        return  vacinaService.listarVacinas();





    }
}
