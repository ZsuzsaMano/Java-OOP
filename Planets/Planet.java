package Planets;

public enum Planet {

    MERCURY(0, 57.9),
    VENUS(0, 108.2),
    ERDE(1, 149.6),
    MARS(2, 227.9),
    JUPITER(95, 778.5),
    SATURN(146, 1430),
    URANUS(28, 2870),
    NEPTUNE(16, 4500);

    private final int NumberOfMoons;
    private final double DistanceFromSun;

    Planet(int NumberOfMoons, double DistanceFromSun) {
        this.NumberOfMoons = NumberOfMoons;
        this.DistanceFromSun = DistanceFromSun;
    }

    int getNumberOfMoons() {
        return this.NumberOfMoons;
    }

    boolean isCloserToSunThan(Planet p2) {
        return this.DistanceFromSun < p2.DistanceFromSun;
    }

}
