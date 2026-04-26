package ExtendedClasses;

public class ToyFactoryTest {
    public static void main(String[] args) throws NoSuchToyExeption { // ends with exception (and shows Stacktrace).
                                                                      // This is only acceptable for tests.
        Toy t1 = ToyFactory.getToy("RubberDuck");
        Toy t2 = ToyFactory.getToy("TeddyBear");
        Toy t3 = ToyFactory.getToy("PlasticCar");
        t1.print();
        t2.print();
        t3.print();
        Toy t4 = ToyFactory.getToy("RubikCube");
        t4.print();
    }
}
