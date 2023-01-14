package br.example.behavioral.command;

import java.util.List;

public class AllLightCommand implements Command {

    private List<Light> lights;

    public AllLightCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.stream()
                .filter(Light::isOn)
                .forEach(Light::toggle);
    }
}
