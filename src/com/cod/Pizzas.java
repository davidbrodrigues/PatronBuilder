package com.cod;

public class Pizzas {
    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private boolean cebolla;
    private String tipoSalsa;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;

    public Pizzas() {
    }

    public Pizzas(String masa, boolean relleno, int tipo, boolean salsa, boolean cebolla, String tipoSalsa, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.cebolla = cebolla;
        this.tipoSalsa = tipoSalsa;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "Ingredientes de la pizza: " +
                "masa " + masa + '\'' +
                ", tiene relleno " + relleno +
                ", es de tipo " + tipo +
                ", tiene salsa " + salsa +
                ", tipo de salsa '" + tipoSalsa + '\'' +
                ", tiene cebolla " + cebolla +
                ", es sin gluten " + sinGluten +
                ", tiene extra de queso " + extraQueso +
                ", tiene piña " + piña +
                ", tiene champiñones " + champiñones +
                ", tiene jamon " + jamon +
                '}';
    }
}
