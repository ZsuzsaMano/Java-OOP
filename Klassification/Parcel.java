package Klassification;

public class Parcel implements PostalItem {
    int weight;
    String sender;
    String addressee;
    String size;

    public Parcel(int weight, String sender, String addressee, String size) {
        this.weight = weight;
        this.sender = sender;
        this.addressee = addressee;
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public String getSender() {
        return sender;
    }

    public String getAddressee() {
        return addressee;
    }

}
