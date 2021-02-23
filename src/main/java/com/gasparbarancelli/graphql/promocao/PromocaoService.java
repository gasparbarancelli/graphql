package com.gasparbarancelli.graphql.promocao;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class PromocaoService {

    private final List<Promocao> promocoes = List.of(
            new Promocao("Dia das mães", BigDecimal.TEN, LocalDate.parse("2021-05-01"), LocalDate.parse("2021-05-09")),
            new Promocao("Natal", BigDecimal.valueOf(13), LocalDate.parse("2021-12-03"), LocalDate.parse("2021-12-25"))
    );

    public List<Promocao> get(LocalDate data) {
        if (Objects.isNull(data)) {
            return promocoes;
        }

        return promocoes.stream()
                .filter(s -> s.getDataInicial().compareTo(data) <= 0 && s.getDataFinal().compareTo(data) >= 0)
                .collect(Collectors.toList());
    }

}
