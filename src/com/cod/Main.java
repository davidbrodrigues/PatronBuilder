package com.cod;

import static com.cod.Pizzas.*;

public class Main {

    public static void main(String[] args) {
        /*
        Pizzas basica = new Pizzas();
        Pizzas napolitana = new Pizzas(Pizzas.FINA, Pizzas.GRANDE, Pizzas.BARBACOA, true, false, false, true, true, Pizzas.PARALLEVAR);
        System.out.println(basica.toString());
        System.out.println(napolitana.toString());
         */
        /*
        //instancio el builder
        PizzaBuilder miBuilder = new PizzaBuilder();
        PizzaBuilder miBuilder2 = miBuilder.setTipoMasa(PAN);
        PizzaBuilder miBuilder3 = miBuilder2.setSize(PEQUEÑA);
        //construyo la pizza
        Pizzas creadaConBuilder = miBuilder.build();
         */

        //como los metodos de la clase PizzaBuilder me devuelven un objeto de tipo builder puedo encadenar metodo tras metodo y
        //el .build() me devuelve una Pizza puedo recoger la pizza final de una vez.
        Pizzas miPizza = new PizzaBuilder()
                .setTipoMasa(FINA)
                .setSize(GRANDE)
                .build();
        System.out.println(miPizza.toString());

        Pizzas miPizza2 = new PizzaBuilder()
                .setTipoMasa(PAN)
                .setSize(MEDIANA)
                .build();
        System.out.println(miPizza2.toString());
    }
}
