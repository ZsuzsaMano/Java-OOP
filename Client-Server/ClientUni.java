import java.io.*;
import java.net.Socket;

// aus dem Netz der FernUniversität unter 
// 132.176.108.140auf Port 7893. 
// Benutzernamen beliebiges Wort(Buchstaben und Zahlen ohne Son-derzeichen,Umlaute etc.)mit einer maximalen Länge von 16 Zeichen wählen.
// Passwort  „einfoop63611“

public class ClientUni {

    public static void main(String[] args) throws IOException {
        try (Socket so = new Socket("132.176.108.140", 7893)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(so.getInputStream(), "UTF-8"));
            OutputStreamWriter out = new OutputStreamWriter(so.getOutputStream(), "UTF-8");

            boolean firstInfo = true;
            boolean shallrun = true;
            while (shallrun) {
                String line = in.readLine();
                System.out.println(line);
                if (line.startsWith("INFO")) {
                    if (firstInfo) {
                        firstInfo = false;
                        out.write("LOGIN test einfoop63611 \r\n");
                        out.flush();
                    }
                }
                if (line.startsWith("AUFGABE")) {
                    int result = compute(line);
                    System.out.println(result);
                    out.write(result + "\r\n");
                    out.flush();
                }
                if (line.startsWith("ENDE")) {
                    shallrun = false;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static int compute(String challenge) {
        String[] challengeParts = challenge.split(" ");
        int operand1 = Integer.parseInt(challengeParts[1]);
        String operator = challengeParts[2];
        int operand2 = Integer.parseInt(challengeParts[3]);
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException();
        }
    }

}
