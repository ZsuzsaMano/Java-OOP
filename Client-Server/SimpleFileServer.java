import java.io.*;
import java.net.*;

public class SimpleFileServer {
    public final static int SERVER_PORT = 7891;

    public static void main(String[] args) throws IOException {
        try (ServerSocket servsock = new ServerSocket(SERVER_PORT);) {
            while (true) {
                try (Socket sock = servsock.accept();) {
                    System.out.println("Server bereit an Port " + SERVER_PORT);

                    // Öffnen des Eingabestroms zum Client und Lesen des Kommandos
                    BufferedReader fromClient = new BufferedReader(
                            new InputStreamReader(sock.getInputStream(), "UTF-8"));
                    String request = fromClient.readLine();
                    if (request.startsWith("GET ")) {
                        String fileName = request.substring(4);
                        // Öffnen des Eingabestroms zur Datei
                        try (BufferedInputStream fromFile = new BufferedInputStream(new FileInputStream(fileName));) {
                            // Öffnen des Ausgabestroms zum Client
                            BufferedOutputStream toClient = new BufferedOutputStream(sock.getOutputStream());
                            // Ubertragen der Datei
                            int data = -1;
                            while ((data = fromFile.read()) != -1) {
                                toClient.write(data);
                            }
                            toClient.flush();
                            System.out.println("Datei " + fileName + " wurde an " +
                                    sock.getInetAddress() + " übertragen.");
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}