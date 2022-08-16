package testeMain;

import model.IcmsEstados;
import model.Orcamento;
import model.calculoIcms.CalculoPorRegiao;
import model.calculoIcms.IcmsFactory;

import java.math.BigDecimal;
import java.util.Scanner;

public class TesteMainICMS {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("800.0"), IcmsEstados.ICMS_MG);
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado(IcmsEstados.ICMS_MG).calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }
}
