package org.example.structural.bridge.example01;

import org.example.structural.bridge.example01.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
