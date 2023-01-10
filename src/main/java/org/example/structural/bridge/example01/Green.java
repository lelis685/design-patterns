package org.example.structural.bridge.example01;

import org.example.structural.bridge.example01.Color;

public class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color...");
    }
}
