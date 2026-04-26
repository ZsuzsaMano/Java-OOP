package ExtendedClasses;

public class ToyFactory {
    public static Toy getToy(String kindOfToy) throws NoSuchToyExeption {
        switch (kindOfToy) {
            case "RubberDuck":
                return new RubberDuck();

            case "TeddyBear":
                return new TeddyBear();

            case "PlasticCar":

                return new PlasticCar();

            default:
                String message = "This factory cannot create " + kindOfToy + "s.";
                throw new NoSuchToyExeption(message);
        }
    }

}
