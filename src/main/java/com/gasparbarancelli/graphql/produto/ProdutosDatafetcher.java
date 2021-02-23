package com.gasparbarancelli.graphql.produto;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;

@DgsComponent
public class ProdutosDatafetcher {

    private final ProdutoService produtoService;

    public ProdutosDatafetcher(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @DgsData(parentType = "Query", field = "produtos")
    public List<Produto> produtos(@InputArgument("descricaoFilter") String descricao) {
        return produtoService.get(descricao);
    }

}