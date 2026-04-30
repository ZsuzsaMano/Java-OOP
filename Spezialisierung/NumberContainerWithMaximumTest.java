package Spezialisierung;

public class NumberContainerWithMaximumTest {
    public static void main(String[] args) {
        NumberContainerWithMaximum maxcontainer = new NumberContainerWithMaximum();
        maxcontainer.store(7);
        maxcontainer.store(5);
        maxcontainer.store(17);
        maxcontainer.store(3);
        Number max = maxcontainer.getMaximum();
        System.out.println(max);

    }

}
