package br.com.alura.codechella.aplicacao.tipoingresso;

import br.com.alura.codechella.Definicao;
import br.com.alura.codechella.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
