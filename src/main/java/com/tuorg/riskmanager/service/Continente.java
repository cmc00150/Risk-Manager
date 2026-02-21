package com.tuorg.riskmanager.service;


import java.util.List;

public class Continente {
    private String nombre;
    private int tropasBonus;
    private List<Territorio> continentes;

    private Continente(){}
    private String getnombre() {
        return nombre;
    }

    private void setnombre(String nombre) {
        this.nombre = nombre;
    }

    private int getTropasBonus() {
        return tropasBonus;
    }

    private void setTropasBonus(int tropasBonus) {
        this.tropasBonus = tropasBonus;
    }

    private List<Territorio> getContinentes() {
        return continentes;
    }

    private void setContinentes(List<Territorio> continentes) {
        this.continentes = continentes;
    }
}
