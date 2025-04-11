package br.com.alura.adopet.api.controller;

import br.com.alura.adopet.api.dto.AprovacaoAdocaoDto;
import br.com.alura.adopet.api.dto.ReprovacaoAdocaoDto;
import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.service.AdocaoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;


@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class AdocaoControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private AdocaoService service;

    @Autowired
    private JacksonTester<Object> jsonDto;

    @Test
    void deveriaDevolverCodigo400ParaSolicitacaoDeAdocaoComErros() throws Exception {
        //ARRANGE
        String json = "{}";
        //ACT
        var response = mvc.perform(
                post("/adocoes")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        Assertions.assertEquals(400,response.getStatus());
    }

    @Test
    void deveriaDevolverCodigo200ParaSolicitacaoDeAdocaoSemErros() throws Exception {
        AprovacaoAdocaoDto dto = new AprovacaoAdocaoDto(1l);
        //ACT
        var response = mvc.perform(
                put("/adocoes/aprovar")
                        .content(jsonDto.write(dto).getJson())
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        Assertions.assertEquals(200,response.getStatus());
    }

    @Test
    void deveriaDevolverCodigo200ParaSolicitacaoDeAprovacaoSemErros() throws Exception {
        //ARRANGE
        AprovacaoAdocaoDto dto = new AprovacaoAdocaoDto(1l);
        //ACT
        var response = mvc.perform(
                put("/adocoes/aprovar")
                        .content(jsonDto.write(dto).getJson())
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        Assertions.assertEquals(200,response.getStatus());
    }

    @Test
    void deveriaDevolverCodigo200ParaSolicitacaoDeReprovacaoSemErros() throws Exception {
        //ARRANGE
        ReprovacaoAdocaoDto dto = new ReprovacaoAdocaoDto(1l,"motivo qualquer");
        //ACT
        var response = mvc.perform(
                put("/adocoes/reprovar")
                        .content(jsonDto.write(dto).getJson())
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        Assertions.assertEquals(200,response.getStatus());
    }


}