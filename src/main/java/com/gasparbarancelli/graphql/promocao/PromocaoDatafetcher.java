package com.gasparbarancelli.graphql.promocao;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;

import java.time.LocalDate;
import java.util.List;

@DgsComponent
public class PromocaoDatafetcher {

    private final PromocaoService promocaoService;

    public PromocaoDatafetcher(PromocaoService promocaoService) {
        this.promocaoService = promocaoService;
    }

    @DgsData(parentType = "Query", field = "promocoes")
    public List<Promocao> promocoes(@InputArgument("dataFilter") LocalDate data) {
        return promocaoService.get(data);
    }

}