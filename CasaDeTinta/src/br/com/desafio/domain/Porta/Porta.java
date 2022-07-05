package br.com.desafio.domain.Porta;

import java.math.BigDecimal;

public class Porta {

    public static BigDecimal altura = new BigDecimal(1.9);
    public static BigDecimal largura = new BigDecimal(0.8);

    public BigDecimal getArea(){
        return this.altura.multiply(largura);
    }
}
