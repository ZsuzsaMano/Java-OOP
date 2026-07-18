package s4.Tupel;

public class Tupel<T extends Druckbar> {
    T links;
    T rechts;

    Tupel(T links, T rechts) {
        this.links = links;
        this.rechts = rechts;
    }

    public T getLinks() {
        return links;
    }

    public T getRechts() {
        return links;
    }

    public void beideDrucken() {
        links.drucken();
        rechts.drucken();
    }

}
