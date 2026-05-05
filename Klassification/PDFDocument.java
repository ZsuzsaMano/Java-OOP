package Klassification;

public class PDFDocument implements Printable {
    String title;

    public PDFDocument(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("The pdf title is: " + title);
    }

}
