package model.calculoIcms;

import model.IcmsEstados;
import model.Orcamento;
public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorEstado(IcmsEstados icmsEstados) {
        if (icmsEstados.equals(IcmsEstados.ICMS_MG)) {
            return new IcmsMG();
        } else if (icmsEstados.equals(IcmsEstados.ICMS_SP)) {
            return new IcmsSP();
        }else if ((icmsEstados.equals(IcmsEstados.ICMS_RJ))){
            return new IcmsRJ();
        }else if((icmsEstados.equals(IcmsEstados.ICMS_ES))){
            return new IcmsES();
        }else{
            return null;
        }
    }
}