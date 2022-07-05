package br.com.desafio.domain.Janela;

import java.math.BigDecimal;

public class Janela {

    public static BigDecimal altura = new BigDecimal(1.2);
    public static BigDecimal largura = new BigDecimal(2);

    public BigDecimal getArea(){
        return altura.multiply(largura);
    }
}
