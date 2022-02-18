package com.cod;

public class PizzaBuilder {
    //Primero instancio un objeto pizza
    //Le antepongo una barra baja para dejar en claro que es un objeto de esta clase
    private Pizzas _pizza;
    //Creo el metodo build que devuelve la pizza
    public Pizzas build(){
        return this._pizza;
    }
    //Tengo que definir el constructor por defecto del builder para que cuando le instancie se genere una pizza (por defecto)
    public PizzaBuilder(){
        _pizza=new Pizzas();
    }
    public PizzaBuilder setTipoMasa(int tipoMasa){
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }
    public PizzaBuilder setSize(int size){
        _pizza.setSize(size);
        return this;
    }
}
