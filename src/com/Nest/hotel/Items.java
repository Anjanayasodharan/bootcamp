package com.Nest.hotel;

import java.util.Scanner;
public class Items {


    int tea,coffee, idli , dosa;

    public Items(int tea, int coffee, int idli, int dosa) {
        this.tea = tea;
        this.coffee = coffee;
        this.idli = idli;
        this.dosa = dosa;
    }

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getIdli() {
        return idli;
    }

    public void setIdli(int idli) {
        this.idli = idli;
    }

    public int getDosa() {
        return dosa;
    }

    public void setDosa(int dosa) {
        this.dosa = dosa;
    }
}

