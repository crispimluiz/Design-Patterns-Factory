package model;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valorOrcamento;
    private IcmsEstados icmsEstados;

    public Orcamento() {
    }

    public Orcamento(BigDecimal valorOrcamento, IcmsEstados icmsEstados) {
        this.valorOrcamento = valorOrcamento;
        this.icmsEstados = icmsEstados;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public IcmsEstados getIcmsEstados() {
        return icmsEstados;
    }

    public void setIcmsEstados(IcmsEstados icmsEstados) {
        this.icmsEstados = icmsEstados;
    }
}
