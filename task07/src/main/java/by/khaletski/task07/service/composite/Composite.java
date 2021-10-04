package by.khaletski.task07.service.composite;

import java.util.LinkedList;
import java.util.List;

public class Composite implements Component {
    private List<Component> componentList = new LinkedList<>();
    private Type type;

    public Composite(Type type) {
        this.type = type;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public int size() {
        return componentList.size();
    }

    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() { //вместо метода collect
        StringBuilder result = new StringBuilder();
        for (Component component : componentList) {
            result.append(component);
            if (component.getType() == Type.PARAGRAPH) {
                result.append("    ");
            }
            if (component.getType() == Type.SENTENCE) {
                result.append(" ");
            }
            if (component.getType() == Type.LEXEME) {
                result.append(" ");
            }
            if (component.getType() == Type.PARAGRAPH) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
