package by.khaletski.task06.service;

import by.khaletski.task06.entity.Cone;

public interface Repository {
    Cone getElement(int index);

    void replaceElement(int index, Cone cone);

    void addElement(int index, Cone cone);

    void deleteElement(int index);
}
