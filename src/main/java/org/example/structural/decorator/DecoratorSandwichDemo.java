package org.example.structural.decorator;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		Sandwich sandwichOnlyMeat = new MeatDecorator(new SimpleSandwich());
		
		System.out.println(sandwich.make());
		System.out.println(sandwichOnlyMeat.make());
	}
}
