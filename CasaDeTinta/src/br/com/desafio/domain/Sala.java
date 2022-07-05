package br.com.desafio.domain;

import br.com.desafio.domain.Porta.Porta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sala {

    private Parede parede1;
    private Parede parede2;
    private Parede parede3;
    private Parede parede4;


    public Sala(Parede parede1, Parede parede2, Parede parede3, Parede parede4) {
        this.parede1 = parede1;
        this.parede2 = parede2;
        this.parede3 = parede3;
        this.parede4 = parede4;
    }

    public List<Parede> paredes(){
        return new ArrayList<Parede>(){{
            add(parede1);
            add(parede2);
            add(parede3);
            add(parede4);
        }};
    }

    public Boolean paradesComJanelasIsValid(){



        return paredes().stream().allMatch(c -> {
            if(c.hasJanela()){
                if(c.getAlturaParede().doubleValue() < Porta.altura.add(new BigDecimal(0.30)).doubleValue()){
                    System.out.println("Altura das paredes vede ser maior que " + Porta.altura.add(new BigDecimal(0.30)).doubleValue());
                    return false;
                }
                return true;
            }
            return true;
        });
    }

    public Boolean paredesIsValid(){
        return this.paredes().stream().allMatch(parede -> parede.paredeIsValid());
    }

    public Boolean salaIsValid(){

        if(paradesComJanelasIsValid() && paredesIsValid()){
            return true;
        }

        System.out.println("Sala não é válida");

        return false;
    }
}
