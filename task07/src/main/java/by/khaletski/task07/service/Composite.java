package by.khaletski.task07.service;

import by.khaletski.task07.entity.Type;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> components;
    private Type type;

    public Composite(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void addComponent(Component component) {
        if (components == null) components = new ArrayList<>();
        components.add(component);
    }

    public void removeComponent(Component component) {
        if (components != null) components.remove(component);
    }

    @Override
    public String collect() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Component component : components) {
            stringBuilder.append(component.collect());
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Composite{" +
                "type=" + type +
                ", components=" + components +
                '}';
    }
}
