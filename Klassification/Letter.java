package Klassification;

public class Letter implements PostalItem, Printable {
    private String sender;
    private String addressee;
    private double weight;

    public Letter(String sender, String addressee, double weight) {
        this.sender = sender;
        this.addressee = addressee;
        this.weight = weight;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getAddressee() {
        return addressee;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("Letter from " + sender + " to " + addressee);
    }
}
