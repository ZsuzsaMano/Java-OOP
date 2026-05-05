package Klassification;

public class Dog implements Weighable {
    int weight;
    String name;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    String getName() {
        return name;
    }

}
