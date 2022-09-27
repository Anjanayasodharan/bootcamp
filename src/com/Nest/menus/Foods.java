package com.Nest.menus;

public class Foods {
    int tea;
    int coffee;
    int idli;
    int appam;

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

    public int getAppam() {
        return appam;
    }

    public void setAppam(int appam) {
        this.appam = appam;
    }

    public Foods(int tea, int coffee, int idli, int appam) {
        this.tea = tea;
        this.coffee = coffee;
        this.idli = idli;
        this.appam = appam;

    }
}
