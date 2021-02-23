package com.gasparbarancelli.graphql.produto;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final List<Produto> produtos = List.of(
            new Produto(1L, "Cadeira", BigDecimal.valueOf(110)),
            new Produto(2L, "Mesa", BigDecimal.valueOf(999)),
            new Produto(3L, "Monitor", BigDecimal.valueOf(1200)),
            new Produto(4L, "Mouse", BigDecimal.valueOf(320.50)),
            new Produto(5L, "Teclado", BigDecimal.valueOf(275))
    );

    public List<Produto> get(String descricao) {
        if (Objects.isNull(descricao)) {
            return produtos;
        }

        return produtos.stream()
                .filter(s -> s.getDescricao().contains(descricao))
                .collect(Collectors.toList());
    }
}
