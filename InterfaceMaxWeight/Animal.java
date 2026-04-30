package InterfaceMaxWeight;

public class Animal implements Weighable {
    private double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
