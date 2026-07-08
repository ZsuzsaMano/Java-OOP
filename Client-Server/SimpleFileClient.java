import java.io.*;
import java.net.Socket;

public class SimpleFileClient {
    public final static int SERVER_PORT = 7891;

    public static void main(String[] args) {
        String host = args[0];
        String fileNameAtServer = args[1];
        String fileNameAtClient = args[2];
        // Try-with-resources-Anweisung
        try (Socket sock = new Socket(host, SERVER_PORT);
                BufferedOutputStream toFile = new BufferedOutputStream(
                        new FileOutputStream(fileNameAtClient));) {
            // Öffnen des Ausgabestroms zum Server und Schreiben des Kommandos
            BufferedWriter toServer = new BufferedWriter(
                    new OutputStreamWriter(sock.getOutputStream(), "UTF-8"));
            String command = "GET " + fileNameAtServer;
            toServer.write(command + "\n");
            toServer.flush();
            // Öffnen des Eingabestroms zum Server
            BufferedInputStream fromServer = new BufferedInputStream(
                    sock.getInputStream());
            // Übertragen der Datei
            int data = -1;
            while ((data = fromServer.read()) != -1) {
                toFile.write(data);
            }
            toFile.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
