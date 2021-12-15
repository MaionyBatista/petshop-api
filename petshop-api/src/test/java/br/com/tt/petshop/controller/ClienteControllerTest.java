package br.com.tt.petshop.controller;

import br.com.tt.petshop.dto.ClienteListagem;
import br.com.tt.petshop.service.ClienteService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@WebMvcTest(controllers = ClienteController.class)
class ClienteControllerTest {
    static final Logger LOG = LoggerFactory.getLogger(ClienteControllerTest.class);

    @Autowired
    MockMvc webclient;

    /*
     * @MockBean: Usem só em teste do Spring
     * Nos demais continue usando só @Mock
     */
    @MockBean
    ClienteService clienteService;

    @Test
    void deveRetornarListaVazia() throws Exception {
        webclient.perform(MockMvcRequestBuilders.get("/clientes"))
                .andExpect(MockMvcResultMatchers.status().is(200));
    }

    @Test
    void deveRetornarDoisClientes() throws Exception {
        Mockito.when(clienteService.listarClientes(null)).thenReturn(List.of(
                new ClienteListagem(1L, "Thor Silva", "755.818.130-51"),
                new ClienteListagem(2L, "Enzo Santos", "373.866.760-18")));

        String json = webclient.perform(MockMvcRequestBuilders.get("/clientes"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("size([*])").value(Matchers.is(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(Matchers.is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].nome").value(Matchers.is("Thor Silva")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].cpf").value(Matchers.is("755.818.130-51")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(Matchers.is(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].nome").value(Matchers.is("Enzo Santos")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].cpf").value(Matchers.is("373.866.760-18")))
                .andReturn().getResponse().getContentAsString();

        //LOG.info(json);
    }

}