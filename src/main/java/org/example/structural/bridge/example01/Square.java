package org.example.structural.bridge.example01;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
