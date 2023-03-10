package br.example.structural.decorator;

public class DressingDecorator extends SandwichDecorator{

    public DressingDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String make() {
        return sandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }

}
