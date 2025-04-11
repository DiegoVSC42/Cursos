package br.com.alura.adopet.api.controller;


import br.com.alura.adopet.api.dto.CadastroAbrigoDto;
import br.com.alura.adopet.api.dto.CadastroPetDto;
import br.com.alura.adopet.api.model.TipoPet;
import br.com.alura.adopet.api.service.AbrigoService;
import br.com.alura.adopet.api.service.PetService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class AbrigoControllerTest {

    @MockBean
    private AbrigoService abrigoService;

    @MockBean
    private PetService petService;

    @Autowired
    MockMvc mvc;

    @Autowired
    JacksonTester<Object> jsonDTO;

    @Test
    void listar() throws Exception {
        var response = mvc.perform(
                get("/abrigos")
                        .contentType(MediaType.APPLICATION_JSON)
                ).andReturn().getResponse();
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void cadastrar1() throws Exception {
        CadastroAbrigoDto dto = new CadastroAbrigoDto("a","6199999999","a@a.com");
        var response = mvc.perform(
                post("/abrigos")
                        .content(jsonDTO.write(dto).getJson())
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        Assertions.assertEquals(200, response.getStatus());

    }

    @Test
    void cadastrar2() throws Exception {
        CadastroAbrigoDto dto = new CadastroAbrigoDto("","","");
        var response = mvc.perform(
                post("/abrigos")
                        .content(jsonDTO.write(dto).getJson())
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        Assertions.assertEquals(400, response.getStatus());

    }

    @Test
    void listarPets() throws Exception {

        String idOuNome = "jorge";

        var response = mvc.perform(
                get("/abrigos/{idOuNome}/pets",idOuNome)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void listarPets2() throws Exception {

        String idOuNome = "";

        var response = mvc.perform(
                get("/abrigos/{idOuNome}/pets",idOuNome)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        Assertions.assertEquals(404, response.getStatus());
    }

    @Test
    void cadastrarPet1() throws Exception {
        CadastroPetDto dto = new CadastroPetDto(TipoPet.GATO,"garibaldo","corno", 24,"sim",42.1f);
        String idOuNome = "carlos";

        var response = mvc.perform(
                post("/abrigos/{idOuNome}/pets",idOuNome)
                        .content(jsonDTO.write(dto).getJson())
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        Assertions.assertEquals(200, response.getStatus());

    }

    @Test
    void cadastrarPet2() throws Exception {
        CadastroPetDto dto = new CadastroPetDto(TipoPet.GATO,"garibaldo","corno", 24,"sim",42.1f);
        String idOuNome = "";

        var response = mvc.perform(
                post("/abrigos/{idOuNome}/pets",idOuNome)
                        .content(jsonDTO.write(dto).getJson())
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        Assertions.assertEquals(404, response.getStatus());

    }
}