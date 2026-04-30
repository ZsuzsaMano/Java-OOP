package InterfaceMaxWeight;

public class MaxWeightContainerTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple(180.4);
        Animal cat = new Animal(9300);
        Animal dog = new Animal(14300);
        Apple apple2 = new Apple(160);
        Apple apple3 = new Apple(172.4);
        MaxWeightContainer mwc = new MaxWeightContainer();
        mwc.store(apple1);
        mwc.store(cat);
        mwc.store(dog);
        mwc.store(apple2);
        mwc.store(apple3);
        Weighable heaviest = mwc.getHeaviest();
        System.out.println(heaviest.getWeight());
    }

}
