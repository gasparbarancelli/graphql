package com.gasparbarancelli.graphql.promocao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao {

    private final String descricao;
    private final BigDecimal desconto;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;

    public Promocao(String descricao, BigDecimal desconto, LocalDate dataInicial, LocalDate dataFinal) {
        this.descricao = descricao;
        this.desconto = desconto;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }
}