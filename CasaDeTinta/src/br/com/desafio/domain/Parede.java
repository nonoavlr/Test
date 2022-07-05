package br.com.desafio.domain;

import br.com.desafio.domain.Janela.Janela;
import br.com.desafio.domain.Porta.Porta;

import java.math.BigDecimal;
import java.util.List;

public class Parede {

    private BigDecimal alturaParede;
    private BigDecimal larguraParede;
    private List<Janela> janelas;
    private List<Porta> portas;

    public Parede(BigDecimal alturaParede, BigDecimal larguraParede, List<Janela> janelas, List<Porta> portas) {
        this.alturaParede = alturaParede;
        this.larguraParede = larguraParede;
        this.janelas = janelas;
        this.portas = portas;
    }

    public BigDecimal getAlturaParede() {
        return alturaParede;
    }

    public BigDecimal getLarguraParede() {
        return larguraParede;
    }

    public BigDecimal getAreaJanelas(){
        return this.janelas.stream().reduce(BigDecimal.ZERO, (soma, janela) -> soma.add(janela.getArea()), BigDecimal::add);
    }

    public BigDecimal getAreaPortas(){
        return this.portas.stream().reduce(BigDecimal.ZERO, (soma, porta) -> soma.add(porta.getArea()), BigDecimal::add);
    }

    public BigDecimal getAreaParedes(){
        return this.alturaParede.multiply(larguraParede);
    }

    public Boolean hasJanela(){
        if(this.janelas.isEmpty()){
            return false;
        }

        return true;
    }

    public Boolean paredeIsValid(){

        if(getAreaParedes().doubleValue() < 1.0 || getAreaParedes().doubleValue() > 50.0){
            System.out.println("Nenhuma parede pode ser maior que 50m2 ou menor que 1m2");
            return false;
        } else if (getAreaJanelas().add(getAreaPortas()).divide(getAreaParedes()).doubleValue() > 0.5){
            System.out.println("A area da janelas + portas não pode ser mais de 50% maior que a area da parede");
            return false;
        }

        return true;
    }
}
