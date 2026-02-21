package com.tuorg.riskmanager.service;

import java.util.List;

public class Mapa {
    private String nombre;
    private List<Continente> continentes;

    private Mapa(){}

    private String getnombre() {
        return nombre;
    }
    private void setnombre(String nombre) {
        this.nombre = nombre;
    }

    private List<Continente> getContinentes() {
        return continentes;
    }
    private void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
    }
}
