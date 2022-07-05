package br.com.desafio;

import br.com.desafio.domain.Janela.Janela;
import br.com.desafio.domain.Parede;
import br.com.desafio.domain.Porta.Porta;
import br.com.desafio.domain.Sala;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Parede parede1 = new Parede(
                new BigDecimal(5),
                new BigDecimal(4),
                new ArrayList<>(){{
                    add(new Janela());
                }},
                new ArrayList<>(){{
                    add(new Porta());
                }}
                );

        Parede parede2 = new Parede(
                new BigDecimal(5),
                new BigDecimal(4),
                new ArrayList<>(){{
                    add(new Janela());
                }},
                new ArrayList<>(){{
                    add(new Porta());
                }}
        );

        Parede parede3 = new Parede(
                new BigDecimal(5),
                new BigDecimal(4),
                new ArrayList<>(){{
                    add(new Janela());
                }},
                new ArrayList<>(){{
                    add(new Porta());
                }}
        );

        Parede parede4 = new Parede(
                new BigDecimal(4),
                new BigDecimal(4),
                new ArrayList<>(){{
                    add(new Janela());
                }},
                new ArrayList<>(){{
                    add(new Porta());
                }}
        );

        Sala sala = new Sala(parede1, parede2, parede3, parede4);

        sala.salaIsValid();

    }
}
