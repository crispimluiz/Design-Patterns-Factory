package model.calculoIcms;

import model.Orcamento;

import java.math.BigDecimal;

public class IcmsSP implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return  orcamento.getValorOrcamento().multiply(new BigDecimal("0.14"));
    }
}
