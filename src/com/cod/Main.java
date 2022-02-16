package com.cod;

public class Main {

    public static void main(String[] args) {
        Pizzas margarita=new Pizzas("normal", false, 1, true, false, "solo tomate", false, false, false, false, false);
        System.out.println(margarita.toString());
        Pizzas prosciuttofunghi=new Pizzas("pan", false, 2, true, false, "solo tomate", true, true, false, true, true);
        System.out.println(prosciuttofunghi.toString());
        Pizzas barbacoa=new Pizzas("finisima", true, 1, true, true, "barbacoa", false, true, false, false, true);
        System.out.println(barbacoa.toString());
    }
}
