package org.example.structural.bridge.example01;

import org.example.structural.bridge.example01.Color;

public class Red implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying red color");
	}

}
