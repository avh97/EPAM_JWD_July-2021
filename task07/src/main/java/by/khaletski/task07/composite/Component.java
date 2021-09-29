package by.khaletski.task07.composite;

public interface Component {
    void add(Composite letter);

    int count();

    void printThisBefore();

    void printThisAfter();

    void print();
}
