package com.tuorg.riskmanager.service;

public class Territorio {
    private String name;
    private Jugador jugador;
    private int tropas;

    private Territorio() {}
    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private Jugador getJugador() {
        return jugador;
    }

    private void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }


    private int getTropas() {
        return tropas;
    }

    private void setTropas(int tropas) {
        this.tropas = tropas;
    }


}
