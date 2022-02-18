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

    @Override
    public String toString() {
        return "Pizzas" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tipo +
                ", salsa=" + salsa +
                ", cebolla=" + cebolla +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon;
    }
}
